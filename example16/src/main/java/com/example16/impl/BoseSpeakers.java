package com.example16.impl;

import org.springframework.stereotype.Component;

import com.example16.interfaces.Speakers;

@Component
public class BoseSpeakers implements Speakers {

	@Override
	public String makeSound() {
		 return "Playing music with Bose speakers";
	}

}
