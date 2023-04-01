package com.example14.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example14.beans.Vehicle;

@Configuration
@ComponentScan({"com.example14.beans",
		"com.example14.impl","com.example14.services"})
public class ProjectConfig {
	
	
}
