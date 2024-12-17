package com.example;

public class Lion implements Animal {
    private final String name;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Lion";
    }
}
