package com.company;

public class Main {

    static int[] randomNumbers;

    public static void main(String[] args) {
        randomNumbers = Tools.generateRandomNumbers(200,50);

        Tools.printSeparator();
        Tools.printTab(randomNumbers);
        Tools.printSeparator();

        Histogram histogram = new Histogram(randomNumbers);
        histogram.printHistInfo();
        Tools.printSeparator();
    }
}
