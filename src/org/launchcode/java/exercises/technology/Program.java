package org.launchcode.java.exercises.technology;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Program {

    private Computer computer;
    private Laptop laptop;

    @Before
    public void createComputerObject(){
        computer = new Computer("Apple", "green", 16);
    }

    @Before
    public void createLaptopObject(){
        laptop = new Laptop("Apple", "green", 32, true);
    }

    @Test
    public void canUpdateComputerColor(){
        computer.updateColor("yellow");
        assertEquals("yellow", computer.getColor());
    }

    @Test
    public void canUpdateComputerMemory(){
        computer.updateMemory(32);
        assertEquals(32, computer.getMemory());
    }

    @Test
    public void notifyUserIfColorUpdateIsSameAsOgForComputer(){
        if(computer.getColor().equals(computer.updateColor("GrEeN"))){
            System.out.println("The computer already is " + computer.getColor() + "!");
        }
    }

    @Test
    public void notifyUserIfMemoryUpdateIsSameAsOgForComputer(){
        if(computer.getMemory() == computer.updateMemory(16)){
            System.out.println("The computer already has " +  computer.getMemory() + "G of memory!");
        }
    }

    @Test
    public void canUpdateLaptopColor(){
        laptop.updateColor("yellow");
        assertEquals("yellow", laptop.getColor());
    }

    @Test
    public void canUpdateLaptopMemory(){
        laptop.updateMemory(32);
        assertEquals(32, laptop.getMemory());
    }

    @Test
    public void notifyUserIfColorUpdateIsSameAsOgForLaptop(){
        if(laptop.getColor().equals(laptop.updateColor("GrEeN"))){
            System.out.println("The laptop is already " + laptop.getColor() + "!");
        }
    }

    @Test
    public void notifyUserIfMemoryUpdateIsSameAsOgForLaptop(){
        if(laptop.getMemory() == laptop.updateMemory(32)){
            System.out.println("The laptop already has " + laptop.getMemory() + "G of memory!");
        }
    }

}
