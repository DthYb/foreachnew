package com.example;

import java.util.List;

public class Pizza {
    private String pate;
    private String base;
    private List<Ingredient> fromages;
    private List<Ingredient> proteines;
    private List<Ingredient> assaisonnements;
    private final double dureeCuissonConseillee = 90;
    private double coutFixe;

    public Pizza(String pate, String base, List<Ingredient> fromages, List<Ingredient> proteines,
            List<Ingredient> assaisonnements, double coutFixe) {
        this.pate = pate;
        this.base = base;
        this.fromages = fromages;
        this.proteines = proteines;
        this.assaisonnements = assaisonnements;
        this.coutFixe = coutFixe;
        validerContrainteBase();
    }

    private void validerContrainteBase() {
        if (fromages.size() >= 4 && !base.equalsIgnoreCase("crème")) {
            throw new IllegalArgumentException("Base crème obligatoire si 4 fromages ou plus.");
        }
    }

    public double calculerPrix() {
        double total = coutFixe;
        for (Ingredient i : fromages)
            total += i.getPrixHT();
        for (Ingredient i : proteines)
            total += i.getPrixHT();
        for (Ingredient i : assaisonnements)
            total += i.getPrixHT();
        return total;
    }

    public double calculerCalories() {
        double total = 0;
        for (Ingredient i : fromages)
            total += i.getCalories();
        for (Ingredient i : proteines)
            total += i.getCalories();
        for (Ingredient i : assaisonnements)
            total += i.getCalories();
        return total;
    }

    public double getDureeCuissonConseillee() {
        return dureeCuissonConseillee;
    }

}
