package com.example9.beans;


import org.springframework.stereotype.Component;


public class Vehicle {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void printHello() {
		System.out.println("Print Hello inside Vehicle");
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}

	public Vehicle() {
		System.out.println("Vehicle Bean created by Spring");
	}
	
}
