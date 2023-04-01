package com.example17.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example17.interfaces.Tyres;

@Component
@Primary
public class MichelinTyres implements Tyres {

    public String rotate(){
        return "Vehicle moving with the help of Michelin tyres";
    }

    public String stop() {
        return "Vehicle stopped with the help of Michelin tyres";
    }

}
