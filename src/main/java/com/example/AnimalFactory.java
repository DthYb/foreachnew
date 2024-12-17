package com.example;

import com.example.Animals.Chien;
import com.example.Animals.Chat;
import com.example.Animals.Lion;

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
        Animal chat = AnimalFactory.createAnimal("Chat", "Mimi");
        Animal lion = AnimalFactory.createAnimal("Lion", "Simba");

        System.out.println(chien.getType() + " " + chien.getName());
        System.out.println(chat.getType() + " " + chat.getName());
        System.out.println(lion.getType() + " " + lion.getName());
    }
}
