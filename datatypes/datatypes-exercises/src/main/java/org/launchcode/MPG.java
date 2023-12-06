package org.launchcode;
import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();

        System.out.println("How many gallons of gas did you use?");
        double gallons = input.nextDouble();

        double mpg = miles/gallons;

        System.out.println("Your miles per gallon are: " + mpg);

    }
}
