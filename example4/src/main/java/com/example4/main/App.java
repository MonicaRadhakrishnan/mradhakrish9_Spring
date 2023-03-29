package com.example4.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example4.beans.Vehicle;
import com.example4.config.ProjectConfig;

public class App 
{
    public static void main( String[] args ){
       
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
   	 	Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());
    }
}
