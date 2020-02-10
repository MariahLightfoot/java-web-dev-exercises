package org.launchcode.java.exercises.technology;

import org.junit.Before;
import org.junit.Test;
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
        smart_phone = new SmartPhone("Apple", "green", 16, "Good");
    }

    //do not need to test Laptop and SmartPhone because they inherit this method that was verified
    @Test
    public void canNotifyUserWhenColorIsUpdated(){
        computer.updateColor("yellow");
        assertEquals("The computer's color has been updated to " + computer.getColor() + "!", computer.updateColor("yellow"));
    }

//    @Test
//    public void canUpdateComputerMemory(){
//        computer.updateMemory(32);
//        assertEquals(32, computer.getMemory());
//        System.out.println("The computer now has " + computer.getMemory() + "G of memory!");
//    }

//    @Test
//    public void notifyUserIfColorUpdateIsSameAsOgForComputer(){
//        if(computer.getColor().equals(computer.updateColor("GrEeN"))){
//            System.out.println("The computer already is " + computer.getColor() + "!");
//        }
//    }
//
//    @Test
//    public void notifyUserIfMemoryUpdateIsSameAsOgForComputer(){
//        if(computer.getMemory() == computer.updateMemory(16)){
//            System.out.println("The computer already has " +  computer.getMemory() + "G of memory!");
//        }
//    }
//
//    @Test
//    public void laptopInheritsSuper(){
//        laptop.updateColor("yellow");
//        assertEquals("yellow", laptop.getColor());
//        System.out.println("The laptop is now " + laptop.getColor() + "!");
//    }
//
//    @Test
//    public void notifyUserIfColorUpdateIsSameAsOgForLaptop(){
//        if(laptop.getColor().equals(laptop.updateColor("GrEeN"))){
//            System.out.println("The laptop is already " + laptop.getColor() + "!");
//        }
//    }
//
//    @Test
//    public void notifyUserIfMemoryUpdateIsSameAsOgForLaptop(){
//        if(laptop.getMemory() == laptop.updateMemory(32)){
//            System.out.println("The laptop already has " + laptop.getMemory() + "G of memory!");
//        }
//    }
//
//    @Test
//    public void canVerifyAndMakeChangesToTouchscreenEntry(){
//        fail("not implemented");
//    }
//
//    @Test
//    public void canUpdateSmartPhoneColor(){
//        smart_phone.updateColor("yellow");
//        assertEquals("yellow", smart_phone.getColor());
//        System.out.println("The smart phone is now " + smart_phone.getColor() + "!");
//    }
//
//    @Test
//    public void canUpdateSmartPhoneMemory(){
//        smart_phone.updateMemory(32);
//        assertEquals(32, smart_phone.getMemory());
//        System.out.println("The smart phone now has " + smart_phone.getMemory() + "G of memory!");
//    }
//
//    @Test
//    public void notifyUserIfColorUpdateIsSameAsOgForSmartPhone(){
//        if(smart_phone.getColor().equals(smart_phone.updateColor("GrEeN"))){
//            System.out.println("The smart phone already is " + smart_phone.getColor() + "!");
//        }
//    }
//
//    @Test
//    public void notifyUserIfMemoryUpdateIsSameAsOgForSmartPhone(){
//        if(smart_phone.getMemory() == smart_phone.updateMemory(16)){
//            System.out.println("The smart phone already has " +  smart_phone.getMemory() + "G of memory!");
//        }
//    }
//
//    @Test
//    public void canUpdateCameraQuality(){
//
//    }
}
