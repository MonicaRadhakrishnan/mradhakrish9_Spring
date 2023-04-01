package com.example14.impl;

import org.springframework.stereotype.Component;

import com.example14.interfaces.Speakers;

@Component
public class BoseSpeakers implements Speakers {

	@Override
	public String makeSound() {
		 return "Playing music with Bose speakers";
	}

}
