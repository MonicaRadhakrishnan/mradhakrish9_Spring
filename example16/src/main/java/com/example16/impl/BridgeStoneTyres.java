package com.example16.impl;

import org.springframework.stereotype.Component;

import com.example16.interfaces.Tyres;

@Component
public class BridgeStoneTyres implements Tyres {
	public String rotate(){
        return "Vehicle moving with BridgeStone tyres";
    }
}
