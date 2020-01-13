package org.launchcode.java.exercises.control_flow_and_collections;

public class Array {
    public static void main(String[] args) {
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

        //why doesn't values print like this?
        //System.out.println(values);

    }
}
