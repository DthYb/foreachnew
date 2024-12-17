package com.example;

public class FourAtomique extends Four {
    public FourAtomique() {
        super(10000000.1, 10000000);
    }

    @Override
    public String getTypeFour() {
        return "Four atomique !";
    }
}
