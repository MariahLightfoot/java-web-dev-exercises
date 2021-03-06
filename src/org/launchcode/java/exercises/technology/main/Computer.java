package org.launchcode.java.exercises.technology.main;

public class Computer extends AbstractEntity{
    private String brand;
    private String color;
    private int memory;

    public Computer(String brand, String color, int memory){
        this.brand = brand;
        this.color = color;
        this.memory = memory;
        this.id = getId();
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color.toLowerCase();
    }


    public int getMemory() { return memory; }

    public String updateColor(String userSelectedColor){
        String transformedUserSelectedColor = userSelectedColor.toLowerCase();

        if(!getColor().equals(transformedUserSelectedColor)){
            this.color = userSelectedColor;
            return "The computer's color has been updated to " + transformedUserSelectedColor + "!";
        } else {
            return "The computer already is " + getColor() + "!";
        }
    }

    public String updateMemory(int userSelectedMemory){

        if(getMemory() != userSelectedMemory){
            this.memory = userSelectedMemory;
            return "The computer now has " + userSelectedMemory + "G of memory!";
        } else {
            return "The computer already has " + userSelectedMemory + "G of memory!";
        }

    }

    @Override
    public String incrementId(){
        int id = 100;

        id++;

        this.id = id;

        return "The object's id is: " + id;
    }

    public int getId(){
        return id;
    }

}
