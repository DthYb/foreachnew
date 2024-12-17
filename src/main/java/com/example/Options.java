package com.example;

public class Options {
    private nom nomOptions;

    private Options(nom nomOptions) {
        this.nomOptions = nomOptions;
    }

    public nom getNomOptions() {
        return nomOptions;
    }

    public void setNomOptions(nom nomOptions) {
        this.nomOptions = nomOptions;
    }

    enum nom {
        GPS,
        TunerFM,
        ToîtOuvrant,
    }
}
