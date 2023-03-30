package com.example10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example10.beans.Person;
import com.example10.beans.Vehicle;



@Configuration
public class ProjectConfig {
	
	@Bean
	public Vehicle vehicle() {
		Vehicle veh = new Vehicle();
		veh.setName("KWID");
		return veh;
	}
	
	@Bean
	public Person person(Vehicle veh) {
		Person prsn = new Person();
		prsn.setName("MONICA");
		prsn.setVehicle(veh);
		return prsn;
	}

}
