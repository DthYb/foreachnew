package com.example;

public class Ingredient {
    private String nom;
    private double prixHT;
    private double calories;
    private String aoc;

    public Ingredient(String nom, double prixHT, double calories, String aoc) {
        this.nom = nom;
        this.prixHT = prixHT;
        this.calories = calories;
        this.aoc = aoc;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public double getCalories() {
        return calories;
    }

    public String getNom() {
        return nom;
    }

    public String getAOC() {
        return aoc;
    }
}
