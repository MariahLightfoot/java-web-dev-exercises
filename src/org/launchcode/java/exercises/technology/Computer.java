package org.launchcode.java.exercises.technology;

public class Computer {
    private String brand;
    private String color;
    private int memory;

    public Computer(String brand, String color, int memory){
        this.brand = brand;
        this.color = color;
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getMemory() {
        return memory;
    }

    public void updateColor(String userSelectedColor){
        this.color = userSelectedColor;
    }

    public void updateMemory(int userSelectedMemory){
        this.memory = userSelectedMemory;
    }

}
