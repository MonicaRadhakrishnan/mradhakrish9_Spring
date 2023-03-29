package com.example1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example1.beans.Vehicle;

@Configuration
public class ProjectConfig {
	
	
	@Bean
	Vehicle vehicle() {
		
		Vehicle veh = new Vehicle();
		veh.setName("KWID");
		return veh;
	}

}
