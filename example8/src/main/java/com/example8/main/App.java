package com.example8.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example8.beans.Vehicle;


public class App 
{
    public static void main( String[] args ){
       
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
   	 	Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());
    }
}
