package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        Scanner length = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        int userLength = length.nextInt();

        Scanner width = new Scanner(System.in);
        System.out.println("What is the width of the rectangle?");
        int userWidth = width.nextInt();
        length.close();
        width.close();

        int rectangleArea = userLength * userWidth;
        System.out.println("The area of the rectangle is: " + rectangleArea);
    }
}
