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

    public int getMemory() {
        return memory;
    }

    public String updateColor(String userSelectedColor){
        return this.color = userSelectedColor.toLowerCase();
    }

    public int updateMemory(int userSelectedMemory){
       return this.memory = userSelectedMemory;
    }

}
