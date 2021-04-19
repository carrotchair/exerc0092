package com.company;

import java.util.Random;

public class Tools {
    private static final int SEPARATOR_SIZE = 80;

    public static int[] generateRandomNumbers(int upTo, int howMany) {
        int[] numbers = new int[howMany];
        Random random = new Random();

        for (int it = 0; it < howMany; it++) {
            numbers[it] = random.nextInt(upTo);
        }

        return numbers;
    }

    public static void printTab(int[] array) {
        for (int it = 0; it < array.length; it++) {
            System.out.println(array[it]);
        }
    }

    public static void printSeparator() {
        for (int it = 0; it < SEPARATOR_SIZE; it++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
