package org.launchcode.java.studios.countingcharacters;

import java.util.*;

public class CountCharacters {
    //why did intelliJ want me to add userPromptArray here?
    public static <userPromptArray> void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Enter string to be counted: ");
        String userPrompt = prompt.nextLine();

        //going to loop through array and store in a HashMap
        HashMap<Character, Integer> characterCount = new HashMap<>();

        for (int i = 0; i < userPrompt.length(); i++){
            char instanceOfCharacter = userPrompt.charAt(i);
            Integer count = characterCount.getOrDefault(instanceOfCharacter, 0);

            characterCount.put(instanceOfCharacter, count + 1);
        }

        System.out.println(characterCount);
    }
}
