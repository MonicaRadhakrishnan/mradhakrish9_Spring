package com.example8.beans;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;


public class Vehicle {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
