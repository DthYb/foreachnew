package com.example;

public class Main {
    public static void main(String[] args) {
        StringWrapper wrapperForward = new StringWrapper("Hello", false);
        StringWrapper wrapperBackward = new StringWrapper("World", true);

        System.out.println("Parcours de gauche à droite :");
        for (char c : wrapperForward) {
            System.out.print(c + " ");
        }

        System.out.println("\nParcours de droite à gauche :");
        for (char c : wrapperBackward) {
            System.out.print(c + " ");
        }
    }
}