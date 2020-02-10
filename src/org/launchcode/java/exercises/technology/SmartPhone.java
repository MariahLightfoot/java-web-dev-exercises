package org.launchcode.java.exercises.technology;

public class SmartPhone extends Computer{
    private String cameraQuality;

    public SmartPhone(String brand, String color, int memory, String cameraQuality){
        super(brand, color, memory);
        this.cameraQuality = cameraQuality;
    }

    public String getCameraQuality() {
        return cameraQuality;
    }

    public String updateCameraQuality(String userSelectedCameraQuality){
        return this.cameraQuality = userSelectedCameraQuality;

    }
}
