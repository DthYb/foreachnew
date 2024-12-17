package com.example;

public class Car {
    private motorisation moteur;
    private int sièges;
    private String couleur;
    private boite boitedevitesse;
    private int jantes;
    private Options options;

    public Car(motorisation moteur, int sièges, String couleur, boite boitedevitesse, int jantes, Options options) {
        this.moteur = moteur;
        this.sièges = sièges;
        this.couleur = couleur;
        this.boitedevitesse = boitedevitesse;
        this.jantes = jantes;
        this.options = options;
    }

    enum boite {
        auto,
        manu
    }

    enum motorisation {
        Hybrid,
        Diesel,
        Essence,
        Electrique
    }

    public motorisation getMoteur() {
        return moteur;
    }

    public void setMoteur(motorisation moteur) throws Exception {
        if (moteur == null) {
            throw new Exception("Le moteur n'est pas inscrit");
        }
        this.moteur = moteur;
    }

    public int getSièges() {
        return sièges;
    }

    public void setSièges(int sièges) {
        if (sièges < 4) {
            sièges = 4;
        }
        this.sièges = sièges;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public boite getBoitedevitesse() {
        return boitedevitesse;
    }

    public void setBoitedevitesse(boite boitedevitesse) {
        if (boitedevitesse == null) {
            boitedevitesse = boite.auto;
        }
        this.boitedevitesse = boitedevitesse;
    }

    public int getJantes() {
        return jantes;
    }

    public void setJantes(int jantes) {
        if (jantes < 15) {
            jantes = 15;
        }
        this.jantes = jantes;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public Options getOptions() {
        return options;
    }
}
