package com.example1.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example1.beans.Vehicle;
import com.example1.config.ProjectConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Vehicle vehicle = new Vehicle();
    	vehicle.setName("HONDA CITY");
    	System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());
        
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    	 Vehicle veh = context.getBean(Vehicle.class);
         System.out.println("Vehicle name from Spring Context is: " + veh.getName());
    }
}
