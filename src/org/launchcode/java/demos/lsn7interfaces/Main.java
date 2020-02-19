package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        flavors.sort(new FlavorComparator());
        System.out.println(flavors);

        cones.sort(new ConeComparator());
        System.out.println(cones);
    }
}
