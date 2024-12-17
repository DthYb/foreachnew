package com.example;

public class Main {
    public static void main(String[] args) {
        Singleton slg = null;
        Boolean status = false;
        if (!status) {
            slg = new Singleton("test");
            System.err.println(slg);
        }
        System.err.println(slg);
    }
}