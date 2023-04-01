package com.example13.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example13.interfaces.Tyres;

@Component
@Primary
public class MichelinTyres implements Tyres {

	public String rotate(){
        return "Vehicle moving with Michelin tyres";
    }
}
