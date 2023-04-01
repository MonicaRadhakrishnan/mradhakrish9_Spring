package com.example17.implementation;

import org.springframework.stereotype.Component;

import com.example17.interfaces.Tyres;

@Component
public class BridgeStoneTyres implements Tyres {


    public String rotate(){
        return "Vehicle moving with the help of BridgeStone tyres";
    }

    public String stop() {
        return "Vehicle stopped with the help of BridgeStone tyres";
    }
}
