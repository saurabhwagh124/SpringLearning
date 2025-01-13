package org.example.config;
import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    @Bean(name = {"com1", "beast", "desktop"})
    @Primary
    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    public Alien alien(@Qualifier("laptop") Computer com){
        Alien obj = new Alien();
        obj.setAge(21);
        obj.setCom(com);
        return obj;
    }

    @Bean
    @Lazy
    public Laptop laptop(){
        return new Laptop();
    }
}
