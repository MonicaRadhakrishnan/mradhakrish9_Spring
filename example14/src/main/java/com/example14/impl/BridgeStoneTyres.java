package com.example14.impl;

import org.springframework.stereotype.Component;

import com.example14.interfaces.Tyres;

@Component
public class BridgeStoneTyres implements Tyres {
	public String rotate(){
        return "Vehicle moving with BridgeStone tyres";
    }
}
