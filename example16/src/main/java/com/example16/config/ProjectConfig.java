package com.example16.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example16.beans.Vehicle;

@Configuration
@ComponentScan({"com.example16.beans",
		"com.example16.impl","com.example16.services"})
public class ProjectConfig {
	
	
}
