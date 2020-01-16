package org.launchcode.java.studios.countingcharacters;

import java.util.Scanner;

public class Prompt {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Enter string to be counted: ");
        String userPrompt = prompt.nextLine();
    }
}
