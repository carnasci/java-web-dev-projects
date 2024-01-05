package org.launchcode;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> numberArray = new ArrayList<>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
                add(6);
                add(7);
                add(8);
                add(9);
                add(10);
            }
        };

        System.out.println(sumEven(numberArray));

        }
    public static int sumEven(ArrayList<Integer> array1) {
        int total = 0;
        for (int number : array1) {
            if (number % 2 == 0) {
                total += number;
            }
        }
        return total;
    }


    }

