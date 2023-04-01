package com.example14.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example14.interfaces.Speakers;
import com.example14.interfaces.Tyres;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class VehicleServices {

	@Autowired
	private Speakers speakers;
	private Tyres tyres;
	public Speakers getSpeakers() {
		return speakers;
	}
	public void setSpeakers(Speakers speakers) {
		this.speakers = speakers;
	}
	public Tyres getTyres() {
		return tyres;
	}
	@Autowired
	public void setTyres(Tyres tyres) {
		this.tyres = tyres;
	}
	
	public void playMusic(){
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle(){
        String status = tyres.rotate();
        System.out.println(status);
    }
}
