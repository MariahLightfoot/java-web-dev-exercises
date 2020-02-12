package org.launchcode.java.exercises.technology.main;

public class Laptop extends Computer{
    private boolean isTouchscreen;

    public Laptop(String brand, String color, int memory, boolean isTouchscreen){
        super(brand, color, memory);
        this.isTouchscreen = isTouchscreen;
        this.getId();
    }

    public boolean getIsTouchscreen(){

        return isTouchscreen;
    }

    @Override
    public String incrementId(){
        int id = 200;

        id++;

        this.id = id;

        return "The object's id is: " + id;
    }

}
