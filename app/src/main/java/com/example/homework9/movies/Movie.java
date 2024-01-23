package com.example.homework9.movies;

import java.io.Serializable;

public class Movie implements Serializable {
    private final String name;
    private final int years;
    private final String desctiption;

    public Movie(String name, int years, String desctiption) {
        this.name = name;
        this.years = years;
        this.desctiption = desctiption;
    }

    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    public String getDesctiption() {
        return desctiption;
    }
}
