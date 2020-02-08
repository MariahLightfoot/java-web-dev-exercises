package org.launchcode.java.demos.lsn6inheritance.main;


public class Main {
    public static void main(String[] args) {
        HouseCat gerry = new HouseCat("Gerry", 50);
        gerry.eat();
        System.out.println(gerry.isTired());

        HouseCat ram = new HouseCat("Ram");
        System.out.println(ram.getWeight());
    }

}