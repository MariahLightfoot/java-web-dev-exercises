package org.launchcode.java.exercises.technology;

public class Laptop extends Computer{
    private boolean isTouchscreen;

    public Laptop(String aBrand, String aColor, int aMemory, boolean isATouchscreen){
        super(aBrand, aColor, aMemory);
        isATouchscreen = isTouchscreen;
    }

    public boolean getIsTouchscreen(){
        return isTouchscreen;
    }
}
