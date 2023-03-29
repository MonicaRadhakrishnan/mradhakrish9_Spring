package com.example2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example2.beans.Vehicle;



@Configuration
public class ProjectConfig {
	
	
	@Bean
	Vehicle vehicle1() {
		Vehicle veh = new Vehicle();
		veh.setName("KWID");
		return veh;
	}
	@Bean
	Vehicle vehicle2() {
		Vehicle veh = new Vehicle();
		veh.setName("HONDA");
		return veh;
	}
	@Bean
	Vehicle vehicle3() {
		Vehicle veh = new Vehicle();
		veh.setName("DZIRE");
		return veh;
	}

}
