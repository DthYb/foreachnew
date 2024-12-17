package com.example;

import java.util.ArrayList;
import java.util.List;

public class PizzaFactory {
    private List<Four> fours;

    public PizzaFactory() {
        this.fours = new ArrayList<>();
    }

    public void ajouterFour(Four four) {
        fours.add(four);
    }

    public void produirePizza(Pizza pizza) {
        for (Four four : fours) {
            if (four.enfournerPizza(pizza)) {
                System.out.println("Pizza ajoutée dans le " + four.getTypeFour());
                return;
            }
        }
        System.out.println("Tous les fours sont pleins. Impossible d'enfourner la pizza.");
    }

    public void surveillerCuisson() {
        for (Four four : fours) {
            System.out.println(
                    "Durée de cuisson pour " + four.getTypeFour() + " : " + four.calculerDureeCuisson() + " secondes.");
        }
    }
}
