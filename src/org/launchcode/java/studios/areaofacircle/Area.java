package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner radius = new Scanner (System.in);
        System.out.println("What is the radius of the circle?");
        double userRadius = radius.nextDouble();

        if(userRadius < 0){
            System.out.println("Only numeric values can be entered!");
            System.exit(0);
        }

        double area = Circle.getArea(userRadius);
        System.out.println("The area of the circle is " + area);
    }
}
