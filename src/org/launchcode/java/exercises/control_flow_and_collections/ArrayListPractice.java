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

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("\n");

        //second part of 3/7/2 ArrayList Practice
        ArrayList<String> words = new ArrayList<>();
        words.add("doggo");
        words.add("kitty");
        words.add("squirrel");
        words.add("bunny");
        words.add("mouse");
        words.add("bee");
        words.add("hamster");
        words.add("snake");

        Scanner length = new Scanner (System.in);
        System.out.println("What word length do you want to use for the search?");
        int userSelectedLength = length.nextInt();

        System.out.println("The words that match that length are: ");
        for(String word : words){
            ArrayList<String> lengthCheck = new ArrayList<String>(Arrays.asList(word.split("")));

            if(lengthCheck.size() == userSelectedLength){
                System.out.println(word);
            }
        }
    }
}
