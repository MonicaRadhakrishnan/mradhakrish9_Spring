package com.example14.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example14.interfaces.Speakers;


@Component
@Primary
public class SonySpeakers implements Speakers {

	@Override
	public String makeSound(){
        return "Playing music with Sony speakers";
    }

}
