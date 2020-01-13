package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String firstSentenceInAliceInWonderland = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String lowerCaseSentence = firstSentenceInAliceInWonderland.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("What term should I search for within the first sentence of Alice in Wonderland?");
        String userSelectedTerm = input.nextLine().toLowerCase();
        input.close();

        if(lowerCaseSentence.contains(userSelectedTerm)){
            int i = lowerCaseSentence.indexOf(userSelectedTerm);
            while(i >= 0){
                System.out.println("index of term is: " + i);
                i = lowerCaseSentence.indexOf(userSelectedTerm, i+1);
            }

            System.out.println("length of term is: " + userSelectedTerm.length());
            String transformedSentence = lowerCaseSentence.replace(userSelectedTerm, "");
            System.out.println("new sentence with term removed is: " + transformedSentence);
        } else {
            System.out.println("false");
        }
    }
}
