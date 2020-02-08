package org.launchcode.java.exercises.technology;

import java.util.ArrayList;

public class SmartPhone extends Computer{
    private String cameraQuality;

    public SmartPhone(String aBrand, String aColor, int aMemory, String aCameraQuality){
        super(aBrand, aColor, aMemory);
        aCameraQuality = cameraQuality;
    }

    public String getCameraQuality() {
        return cameraQuality;
    }

    public String updateCameraQuality(String userSelectedCameraQuality){
        return this.cameraQuality = userSelectedCameraQuality;

    }
}
