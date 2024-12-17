package com.example;

public class Chien implements Animal {
    private final String name;

    public Chien(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Chien";
    }
}
