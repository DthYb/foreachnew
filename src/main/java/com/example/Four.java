package com.example;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Four {
    protected double temperature;
    protected int capaciteMax;
    protected Queue<Pizza> pizzas;

    public Four(double temperature, int capaciteMax) {
        this.temperature = temperature;
        this.capaciteMax = capaciteMax;
        this.pizzas = new LinkedList<>();
    }

    public boolean enfournerPizza(Pizza pizza) {
        if (pizzas.size() < capaciteMax) {
            pizzas.add(pizza);
            System.out.println("Pizza enfournée :) !");
            return true;
        } else {
            System.out.println("Four plein, impossible d'enfourner.");
            return false;
        }
    }

    public Pizza defournerPizza() {
        if (!pizzas.isEmpty()) {
            return pizzas.poll();
        }
        System.out.println("Aucune pizza à défourner.");
        return null;
    }

    public double calculerDureeCuisson() {
        return (400 / temperature) * 90;
    }

    public abstract String getTypeFour();
}
