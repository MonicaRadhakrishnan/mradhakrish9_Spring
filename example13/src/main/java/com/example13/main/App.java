package com.example13.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example13.beans.Person;
import com.example13.beans.Vehicle;
import com.example13.config.ProjectConfig;


public class App 
{
	 public static void main(String[] args) {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
	        String[] persons = context.getBeanNamesForType(Person.class);
	        Person person = context.getBean(Person.class);
	        String[] names = context.getBeanNamesForType(Vehicle.class);
	        /*Vehicle vehicle = context.getBean(Vehicle.class);
	        vehicle.getVehicleServices().playMusic();
	        vehicle.getVehicleServices().moveVehicle();*/
	        person.getVehicle().getVehicleServices().playMusic();
	        person.getVehicle().getVehicleServices().moveVehicle();
	    }
}
