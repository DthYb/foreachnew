package com.example;

import java.util.Arrays;

public class Main {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        clearScreen();

        Ingredient mozzarella = new Ingredient("Mozzarella", 2.5, 100, "Italie");
        Ingredient tomate = new Ingredient("Tomate", 1.0, 50, null);
        Ingredient jambon = new Ingredient("Jambon", 3.0, 150, "France");

        Pizza pizza = new Pizza(
                "fine",
                "tomate",
                Arrays.asList(mozzarella),
                Arrays.asList(jambon),
                Arrays.asList(),
                5.0);

        System.out.println("Prix de la pizza : " + pizza.calculerPrix() + "€");
        System.out.println("Calories de la pizza : " + pizza.calculerCalories());

        PizzaFactory usine = new PizzaFactory();
        usine.ajouterFour(new FourBois());
        usine.ajouterFour(new FourElectrique());

        usine.produirePizza(pizza);
        usine.surveillerCuisson();
    }
}