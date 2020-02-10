package org.launchcode.java.exercises.technology;

public class Laptop extends Computer{
    private boolean isTouchscreen;

    public Laptop(String brand, String color, int memory, boolean isTouchscreen){
        super(brand, color, memory);
        this.isTouchscreen = isTouchscreen;
    }

    public boolean getIsTouchscreen(){

        return isTouchscreen;
    }

}
