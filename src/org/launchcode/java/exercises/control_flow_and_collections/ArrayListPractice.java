package org.launchcode.java.exercises.control_flow_and_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        //first part of 3.7.2 ArrayList Practice
        //created an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        //adding elements to numbers array
        int sum = 0;

        for(int i=1; i<11; i++){
            numbers.add(i);

            //only adding i to sum if it is even
            if(i % 2 == 0){
                sum += i;
            }
        }

        System.out.println(sum);

        //second part of 3/7/2 ArrayList Practice
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> letters = new ArrayList<String>(Arrays.asList(phrase.split(" ")));
        System.out.println(letters);
    }
}
