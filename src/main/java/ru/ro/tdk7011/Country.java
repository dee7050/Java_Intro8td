package ru.ro.tdk7011;

public class Country {

    private String name;
    private double population;
    private boolean accessSea;

    public Country(String name, double population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public double getPopulation() {
        return population;
    }

    public boolean isAccessSea() {
        return accessSea;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public void setAccessSea(boolean accessSea) {
        this.accessSea = accessSea;
    }
}
