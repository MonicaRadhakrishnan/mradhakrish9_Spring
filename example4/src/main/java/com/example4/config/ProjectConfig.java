package com.example4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example4.beans.Vehicle;



@Configuration
public class ProjectConfig {
	
	
	@Bean(name ="KwidVehicle")
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
	@Primary
	@Bean(name ="DzireVehicle")
	Vehicle vehicle3() {
		Vehicle veh = new Vehicle();
		veh.setName("DZIRE");
		return veh;
	}

}
