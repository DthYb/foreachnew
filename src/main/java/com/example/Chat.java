package com.example;

public class Chat implements Animal {
    private final String name;

    public Chat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Chat";
    }
}