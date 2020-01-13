package exercises;

import java.util.Scanner;

public class milesPerGallon {
    public static void main(String[] args){
        Scanner miles = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        int userMiles = miles.nextInt();

        Scanner gallons = new Scanner(System.in);
        System.out.println("How many gallons of gas have you used?");
        int userGallons = gallons.nextInt();
        miles.close();
        gallons.close();

        int milesPerGallon = userMiles/userGallons;
        System.out.println("Your miles-per-gallon is: " + milesPerGallon);
    }
}
