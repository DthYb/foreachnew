package com.example;

public class AnimalFactory {

    public static Animal createAnimal(String type, String name) {
        if (type.equalsIgnoreCase("Chien")) {
            return new Chien(name);
        } else if (type.equalsIgnoreCase("Chat")) {
            return new Chat(name);
        } else if (type.equalsIgnoreCase("Lion")) {
            return new Lion(name);
        } else {
            throw new IllegalArgumentException("Type d'animal non reconnu: " + type);
        }
    }

    public static void main(String[] args) {
        Animal chien = AnimalFactory.createAnimal("Chien", "Rex");
        Animal chat = AnimalFactory.createAnimal("Chat", "Meeko");
        Animal lion = AnimalFactory.createAnimal("Lion", "Simba");

        System.out.println(" Espece : " + chien.getType() + " nom : " + chien.getName());
        System.out.println(" Espece : " + chat.getType() + " nom : " + chat.getName());
        System.out.println(" Espece : " + lion.getType() + " nom : " + lion.getName());
    }
}
