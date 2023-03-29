package com.example3.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example3.beans.Vehicle;
import com.example3.config.ProjectConfig;

public class App 
{
    public static void main( String[] args ){
       
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
   	 	Vehicle veh = context.getBean("HondaVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());
    }
}
