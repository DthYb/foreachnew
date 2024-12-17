package com.example;

public class FourElectrique extends Four {
    public FourElectrique() {
        super(450, 5);
    }

    @Override
    public String getTypeFour() {
        return "Four électrique";
    }
}
