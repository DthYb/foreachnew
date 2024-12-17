package com.example;

import java.util.HashSet;
import java.util.Set;

public class Car {
    private final String motorisation;
    private final int nombreDeSieges;
    private final String couleurCarrosserie;
    private final String couleurInterieure;
    private final String boiteDeVitesse;
    private final int tailleJantes;

    private Car(Builder builder) {
        this.motorisation = builder.motorisation;
        this.nombreDeSieges = builder.nombreDeSieges;
        this.couleurCarrosserie = builder.couleurCarrosserie;
        this.couleurInterieure = builder.couleurInterieure;
        this.boiteDeVitesse = builder.boiteDeVitesse;
        this.tailleJantes = builder.tailleJantes;
    }

    @Override
    public String toString() {
        return "Car{" +
                "motorisation='" + motorisation + '\'' +
                ", nombreDeSieges=" + nombreDeSieges +
                ", couleurCarrosserie='" + couleurCarrosserie + '\'' +
                ", couleurInterieure='" + couleurInterieure + '\'' +
                ", boiteDeVitesse='" + boiteDeVitesse + '\'' +
                ", tailleJantes=" + tailleJantes +
                '}';
    }

    public static class Builder {
        private final String motorisation;
        private int nombreDeSieges = 4;
        private String couleurCarrosserie = "Inconnue";
        private String couleurInterieure = "Inconnue";
        private String boiteDeVitesse = "BVM";
        private int tailleJantes = 15;

        public Builder(String motorisation) {
            this.motorisation = motorisation;
        }

        public Builder setNombreDeSieges(int nombreDeSieges) {
            this.nombreDeSieges = nombreDeSieges;
            return this;
        }

        public Builder setCouleurCarrosserie(String couleurCarrosserie) {
            this.couleurCarrosserie = couleurCarrosserie;
            return this;
        }

        public Builder setCouleurInterieure(String couleurInterieure) {
            this.couleurInterieure = couleurInterieure;
            return this;
        }

        public Builder setBoiteDeVitesse(String boiteDeVitesse) {
            this.boiteDeVitesse = boiteDeVitesse;
            return this;
        }

        public Builder setTailleJantes(int tailleJantes) {
            this.tailleJantes = tailleJantes;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

        public static void main(String[] args) {
            Car voiture = new Car.Builder("Hybride")
                    .setNombreDeSieges(5)
                    .setCouleurCarrosserie("Rouge")
                    .setCouleurInterieure("Noir")
                    .setBoiteDeVitesse("Automatique")
                    .setTailleJantes(17)
                    .build();

            System.out.println(voiture);
        }
    }
}