package com.practiceSet;

import java.util.ArrayList;

public class AutoUnboxExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Autoboxing when adding primitive to list
        numbers.add(1); // int → Integer
        numbers.add(2);
        numbers.add(3);

        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // 
        }

        System.out.println("Sum: " + sum);
    }
}
