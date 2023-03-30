package com.example12.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example12.beans.Vehicle;

@Configuration
@ComponentScan("com.example12.beans")
public class ProjectConfig {
	
	@Bean
	public Vehicle vehicle1() {
		Vehicle veh = new Vehicle();
		veh.setName("KWID");
		return veh;
	}
	@Bean
	public Vehicle vehicle2() {
		Vehicle veh = new Vehicle();
		veh.setName("HONDA");
		return veh;
	}
	@Bean
	/*@Primary*/
	public Vehicle vehicle3() {
		Vehicle veh = new Vehicle();
		veh.setName("DZIRE");
		return veh;
	}
	@Bean
	public Vehicle vehicle4() {
		Vehicle veh = new Vehicle();
		veh.setName("FERARI");
		return veh;
	}
}
