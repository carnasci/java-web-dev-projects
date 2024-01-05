package org.launchcode;


import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] integerArray = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < 6; i++) {
            if (integerArray[i] % 2 != 0) {
                System.out.println(integerArray[i]);
            }
        }
        String drSuess = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitString = drSuess.split(" ");
        System.out.println(Arrays.toString(splitString));

        String[] sentences = drSuess.split("\\.");
        System.out.println(Arrays.toString(sentences));

    }
}
