package com.example7.beans;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
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
	
	@PostConstruct
	public void initialize() {
		this.name = "FERRARI";
	}
}
