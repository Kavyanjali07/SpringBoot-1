package com.kavyanjali.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Student student = context.getBean(Student.class);
		student.setAge(22);
		student.setName("Harsh");
		System.out.println(student.getAge());
		System.out.println(student.getName());
//		Student student = new Student(22,"Kavya");
//
//		System.out.println(student.getAge());
//		System.out.println(student.getName());

	}

}
