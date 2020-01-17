package org.launchcode.java.studios.countingcharacters;

import java.util.*;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Enter string to be counted: ");
        String userPrompt = prompt.nextLine();

        HashMap<Character, Integer> characterCount = new HashMap<>();

        for (int i = 0; i < userPrompt.length(); i++){
            char instanceOfCharacter = userPrompt.charAt(i);
            Integer count = characterCount.getOrDefault(instanceOfCharacter, 0);

            characterCount.put(instanceOfCharacter, count + 1);
        }

        System.out.println(characterCount);
    }
}
