package com.example15.impl;

import org.springframework.stereotype.Component;

import com.example15.interfaces.Speakers;

@Component
public class BoseSpeakers implements Speakers {

	@Override
	public String makeSound() {
		 return "Playing music with Bose speakers";
	}

}
