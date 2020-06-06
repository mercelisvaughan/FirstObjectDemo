package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest {

    @Test
    public void constructorTest(){
        // Given
        String first = "Mercelis";
        String last = "Vaughan";
        int energy = 50;

        // When

        Human testHuman = new Human(first, last); // creates our test object
        String actualFirst = testHuman.getFirstName();
        String actualLast = testHuman.getLastName();
        int actualEnergy = testHuman.getEnergy();

        // Then

        Assert.assertEquals("Mercelis", actualFirst);
        Assert.assertEquals("Vaughan", actualLast);
        Assert.assertEquals(energy, actualEnergy);
    }

    @Test

    public void eatTest(){
        // Given
        Fruit kiwi = new Fruit("Kiwi", 5); // this creates a new fruit object
        int expectedEnergy = 55;

        Human testHuman = new Human("Barack", "Obama"); // this creates a new human object 

        // When / Invoke
        testHuman.eat(kiwi);
        int actualEnergy = testHuman.getEnergy(); // var for actual energy

        // Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test

    public void workTest(){
        // Given
        Human testHuman = new Human("Izuku", "Midoriya");
        int expectedEnergy = 30;

        // When/ Invoke
        testHuman.work(2);
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test

    public void energyMaxTest(){
        // Given
        Human testHuman = new Human("All", "Might");
        Fruit testFruit1 = new Fruit("Banana", 20);
        Fruit testFruit2 = new Fruit("Grapes", 20);
        Fruit testFruit3 = new Fruit("Apple", 20);
        Human.maxEnergy = 100;

        // When 
        testHuman.eat(testFruit1);
        testHuman.eat(testFruit2);
        testHuman.eat(testFruit3);
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(100, actualEnergy);
    }

    @Test

    public void workMin(){
        // Given
        Human testHuman = new Human("Kai", "Chisaki");


        // When
        testHuman.work(6);
        int actualEnergy = testHuman.getEnergy();


        // Then
        Assert.assertEquals(50, actualEnergy);
    }

    @Test

    public void maxEnergyChangeTest(){
        Human human1 = new Human("Forrest", "Whitaker");

        Fruit testFruit1 = new Fruit("Banana", 20);
        Fruit testFruit2 = new Fruit("Grapes", 20);
        Fruit testFruit3 = new Fruit("Apple", 20);

        Human.maxEnergy = 150;

        human1.eat(testFruit1);
        human1.eat(testFruit2);
        human1.eat(testFruit3);

        int actualEnergy = human1.getEnergy();

        Assert.assertEquals(110, actualEnergy);

    }


}