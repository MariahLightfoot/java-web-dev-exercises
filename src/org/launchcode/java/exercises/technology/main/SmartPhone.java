package org.launchcode.java.exercises.technology.main;

public class SmartPhone extends Computer{
    private String cameraQuality;

    public SmartPhone(String brand, String color, int memory, String cameraQuality){
        super(brand, color, memory);
        this.cameraQuality = cameraQuality;
        this.getId();
    }

    public String getCameraQuality() {

        return cameraQuality;
    }

    @Override
    public String incrementId(){
        int id = 300;

        id++;

        this.id = id;

        return "The object's id is: " + id;
    }
}
