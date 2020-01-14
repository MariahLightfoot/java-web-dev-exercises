package org.launchcode.java.exercises.control_flow_and_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        //first part of 3.7.2 ArrayList Practice
        //created an ArrayList of integers
        ArrayList<Integer> integers = new ArrayList<>(10);

        //adding elements to integers array
        int sum = 0;

        for(int i=1; i<11; i++){
            integers.add(i);

            //only adding i to sum if it is even
            if(i % 2 == 0){
                sum += i;
            }

        }

        System.out.println(sum);
    }
}
