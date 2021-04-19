package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

public class Histogram {
    private int[] arrayOfNumbers;
    private Map<Integer, Integer> histogram;

    public Histogram(int[] arrayOfNumbers) {
        this.arrayOfNumbers = arrayOfNumbers;
        histogram = new HashMap<>();
        calculateHist();
    }

    private void calculateHist() {
        for (int number : arrayOfNumbers) {
            if (histogram.containsKey(number)) {
                Integer howManyTimes = histogram.get(number);
                howManyTimes++;
                histogram.put(number, howManyTimes);
            } else {
                histogram.put(number, 1);
            }
        }
    }

    public void printHistInfo() {
        List<Integer> keys = new ArrayList<>(histogram.keySet());
        Collections.sort(keys);
        Collections.reverse(keys);
        for (Integer number : keys) {
            System.out.printf("Number %4d present %4d times\n", number, histogram.get(number));
        }
    }
}
