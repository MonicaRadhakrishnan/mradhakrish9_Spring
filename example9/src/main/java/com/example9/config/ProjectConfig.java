package com.example9.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example9.beans.Person;
import com.example9.beans.Vehicle;



@Configuration
public class ProjectConfig {
	
	@Bean
	public Vehicle vehicle() {
		Vehicle veh = new Vehicle();
		veh.setName("KWID");
		return veh;
	}
	
	@Bean
	public Person person() {
		Person prsn = new Person();
		prsn.setName("MONICA");
		prsn.setVehicle(vehicle());
		return prsn;
	}

}
