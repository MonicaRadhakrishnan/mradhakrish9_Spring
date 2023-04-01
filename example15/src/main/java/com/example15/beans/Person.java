package com.example15.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value="personBean")
@Lazy
public class Person {

	
	private String name ="Monica Radhakrishnan";
	private  final Vehicle vehicle;

	@Autowired
	public Person(Vehicle vehicle) {
		System.out.println("Person Bean Created by Spring");
		this.vehicle = vehicle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

}
