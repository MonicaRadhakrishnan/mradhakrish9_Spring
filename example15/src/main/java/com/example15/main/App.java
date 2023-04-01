package com.example15.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example15.beans.Person;
import com.example15.config.ProjectConfig;
import com.example15.services.VehicleServices;


public class App 
{
	 public static void main(String[] args) {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		 System.out.println("Before retrieving the Person bean from the Spring Context");
	        Person person = context.getBean(Person.class);
	        System.out.println("After retrieving the Person bean from the Spring Context");
}
}
