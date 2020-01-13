package org.launchcode.java.exercises.control_flow_and_collections;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //first part of 3.7.1 Array Practice
        //declares array and allocates 7 spaces for memory
        int[] values = new int[6];

        //populating array - has to be a better way
        values[0] = 1;
        values[1] = 1;
        values[2] = 2;
        values[3] = 3;
        values[4] = 5;
        values[5] = 8;

        //looping through values array
        for (int i=0; i<6; i++){
            if(values[i] % 2 == 1){
                System.out.println(values[i]);
            }
        }

        //second part of 3.7.1 Array Practice
        //declaring an string, using split to store each word in an array
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordsFromPhrase = phrase.split(" ");

        System.out.println(Arrays.toString(wordsFromPhrase));

    }
}
