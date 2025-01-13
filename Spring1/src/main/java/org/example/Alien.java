package org.example;
import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private int salary;

    private Computer com;

    public Alien(){
        System.out.println("Object Created");
    }

    public Alien(int age){
        System.out.println("Parameterized constructor");
        this.age = age;
    }

    @ConstructorProperties({"age", "laptop", "salary"})
    public Alien(int agex, Computer com, int salaryx) {
        System.out.println("More parameters");
        this.age = agex;
        this.salary = salaryx;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("Setter working");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    }
}
