package com.example3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example3.beans.Vehicle;



@Configuration
public class ProjectConfig {
	
	
	@Bean
	Vehicle vehicle1() {
		Vehicle veh = new Vehicle();
		veh.setName("KWID");
		return veh;
	}
	@Bean(name ="HondaVehicle")
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
