package io.codedifferently;

public class Fruit {
    private String type;
    private int energy;

    public Fruit(String type, int energy){
        this.type = type;
        this.energy = energy;

    }

    // getters
    public String getType(){
        return this.type;
    }

    public int getEnergy(){
        return this.energy;
    }
}