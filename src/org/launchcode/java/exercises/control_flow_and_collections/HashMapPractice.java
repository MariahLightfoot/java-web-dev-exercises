package org.launchcode.java.exercises.control_flow_and_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newID;
        String newName;

        System.out.println("Enter student ids or press 0 to finish: ");

        //collecting ids and names for students
        do {
            System.out.println("ID: ");
            newID  = input.nextInt();
            input.nextLine();


            //how could I check if int is == ""?
            if(!newID.equals(0)){
                System.out.println("Student Name: ");
                newName = input.nextLine();

                students.put(newID, newName);

                //if I dont have this when I hit enter after entering id,
                //it thinks the space is the student's name
                //input.nextLine();
            }

        } while (!newID.equals(0));

        //printing ids and names
        System.out.println("\nClass roster:");

        for(Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getKey() + ": " + student.getValue());
        }

    }
}
