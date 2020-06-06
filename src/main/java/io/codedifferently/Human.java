package io.codedifferently;

public class Human {

    private String firstName;
    private String lastName;
    static int maxEnergy = 100;
    private int energy;

    // our default constructor
    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.energy = 50;
    }


    // methods
    public void eat(Fruit fruit){
        if (this.energy + fruit.getEnergy() <= maxEnergy){ // checks to see if our current energy level is less than the max
            this.energy = this.energy + fruit.getEnergy();
        }
        else {
            this.energy = maxEnergy;
            System.out.println("We have eaten too much energy.");
        }
    }

    public void work(int hours_worked){
        int energySpent = hours_worked * 10;

        if (this.energy - energySpent < 0){
            System.out.println("Couldn't work, need food to continue, will you buy me lunch?");
        }
        else {
            this.energy = this.energy - energySpent;
        }
    }

    // getter functions
    public int getEnergy(){
        return this.energy;
    }
    
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
}