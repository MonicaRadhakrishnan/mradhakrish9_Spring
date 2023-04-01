package com.example15.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example15.beans.Vehicle;

@Configuration
@ComponentScan({"com.example15.beans",
		"com.example15.impl","com.example15.services"})
public class ProjectConfig {
	
	
}
