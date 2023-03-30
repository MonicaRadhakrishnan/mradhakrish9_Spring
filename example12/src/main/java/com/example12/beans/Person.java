package com.example12.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private  Vehicle vehicle;
	@Autowired
	/*public Person(Vehicle vehicle1) {
		System.out.println("Person Bean created by Spring");
		this.vehicle =vehicle1;
	}*/
	/*@Autowired
	public Person(Vehicle vehicle) {
		System.out.println("Person Bean created by Spring");
		this.vehicle =vehicle;
	}*/
	public Person(@Qualifier("vehicle4") Vehicle vehicle) {
		System.out.println("Person Bean created by Spring");
		this.vehicle =vehicle;
	}
	private String name ="Tangle";
	
	 public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Vehicle getVehicle() {
	        return vehicle;
	    }
	@Override
	public String toString() {
		return "Person [name=" + name + ", vehicle=" + vehicle + "]";
	}
	

}
