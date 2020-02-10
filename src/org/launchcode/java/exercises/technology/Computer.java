package org.launchcode.java.exercises.technology;

public class Computer {
    private String brand;
    private String color;
    private int memory;

    public Computer(String brand, String color, int memory){
        this.brand = brand;
        this.color = color.toLowerCase();
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getMemory() { return memory; }

    public String updateColor(String userSelectedColor){
        String transformedUserSelectedColor = userSelectedColor.toLowerCase();

        if(getColor().equals(transformedUserSelectedColor)){
            return "The computer already is " + transformedUserSelectedColor + "!";
        } else {
            this.color = userSelectedColor;
            return "The computer's color has been updated to " + transformedUserSelectedColor + "!";
        }
    }

    public String updateMemory(int userSelectedMemory){
        this.memory = userSelectedMemory;
        return "The computer now has " + userSelectedMemory + "G of memory!";
    }

}
