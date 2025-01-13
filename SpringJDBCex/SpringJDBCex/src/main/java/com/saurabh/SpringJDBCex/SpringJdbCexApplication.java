package com.saurabh.SpringJDBCex;

import com.saurabh.SpringJDBCex.model.Student;
import com.saurabh.SpringJDBCex.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbCexApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbCexApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(66);
		s.setName("Saurabh");
		s.setMarks(45);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> studentList = service.getStudents();
		System.out.println(studentList);
	}

}
