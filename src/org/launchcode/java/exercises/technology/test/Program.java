package org.launchcode.java.exercises.technology.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.exercises.technology.main.Computer;
import org.launchcode.java.exercises.technology.main.Laptop;
import org.launchcode.java.exercises.technology.main.SmartPhone;

import static org.junit.Assert.*;

public class Program {

    private Computer computer;
    private Laptop laptop;
    private SmartPhone smart_phone;

    @Before
    public void createComputerObject(){
        computer = new Computer("Apple", "green", 16);
    }

    @Before
    public void createLaptopObject(){
        laptop = new Laptop("Apple", "green", 32, true);
    }

    @Before
    public void createSmartPhoneObject(){
        smart_phone = new SmartPhone("Apple", "green", 32, "good");
    }

    //do not need to recreate first four tests for Laptop and SmartPhone because they inherit these methods that have been verified
    @Test
    public void canNotifyUserWhenColorIsUpdated(){
        assertEquals("The computer's color has been updated to yellow!" , computer.updateColor("yellow"));
    }

    @Test
    public void canNotifyUserWhenMemoryIsUpdated(){
        assertEquals("The computer now has 32G of memory!", computer.updateMemory(32));
    }

    @Test
    public void canNotifyUserIfColorUpdateIsSameAsOgCaseInsensitive(){
        computer.updateColor("GrEeN");
        assertEquals("The computer already is " + computer.getColor() + "!", computer.updateColor("GrEeN"));
    }

    @Test
    public void notifyUserIfMemoryUpdateIsSameAsOg(){
        computer.updateMemory(16);
        assertEquals("The computer already has 16G of memory!", computer.updateMemory(16));
    }

    @Test
    public void childClassesInheritSuper(){
        assertEquals("The computer's color has been updated to yellow!", laptop.updateColor("yellow"));
    }

    @Test
    public void computerIdIncreasesWhenIncrementIdIsCalled(){
        assertEquals("The object's id is: 101", computer.incrementId());
    }

    @Test
    public void laptopIdIncreasesWhenIncrementIdIsCalled(){
        assertEquals("The object's id is: 201", laptop.incrementId());
    }

    @Test
    public void smartPhoneIdIncreasesWhenIncrementIdIsCalled(){
        assertEquals("The object's id is: 301", smart_phone.incrementId());
    }

}
