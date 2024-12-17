package com.example;

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
            validateCar();
            return new Car(this);
        }

        private void validateCar() {
            if (motorisation == null) {
                throw new IllegalArgumentException("La motorisation ne peut pas être nulle.");
            }
            if (motorisation.equalsIgnoreCase("DIESEL")) {
                if (!(couleurCarrosserie.equalsIgnoreCase("NOIR") && couleurInterieure.equalsIgnoreCase("NOIR"))) {
                    throw new IllegalArgumentException("La couleur du véhicule doit être NOIR.");
                }
            } else {
                if (tailleJantes != 16) {
                    throw new IllegalArgumentException("Les jantes doivent être de taille 16.");
                }
                if (!boiteDeVitesse.equalsIgnoreCase("BVA")) {
                    throw new IllegalArgumentException("La boîte de vitesse doit être BVA.");
                }
            }
        }

        public static void clearScreen() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

        public static void main(String[] args) {
            clearScreen();
            Car voiture = new Car.Builder("Hybride")
                    .setNombreDeSieges(5)
                    .setCouleurCarrosserie("Noir")
                    .setCouleurInterieure("Noir")
                    .setBoiteDeVitesse("BVA")
                    .setTailleJantes(16)
                    .build();

            System.out.println(voiture);
        }
    }
}