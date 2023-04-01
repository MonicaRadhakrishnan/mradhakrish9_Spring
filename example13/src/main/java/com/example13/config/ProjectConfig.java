package com.example13.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example13.beans.Vehicle;

@Configuration
@ComponentScan({"com.example13.beans",
		"com.example13.impl","com.example13.services"})
public class ProjectConfig {
	
	
}
