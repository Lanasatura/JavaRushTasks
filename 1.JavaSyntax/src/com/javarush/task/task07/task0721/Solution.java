package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] numbers = new int[20];

        fill(reader, numbers);
        maximum = findMax(numbers);
        minimum = findMin(numbers);

        System.out.print(maximum + " " + minimum);

        reader.close();
    }

    private static void fill(BufferedReader reader, int[] numbers) throws IOException {
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = Integer.parseInt(reader.readLine());
        }
    }

    private static int findMax(int[] numbers) {
        int maximum = numbers[0];

        for (int number : numbers) {
            maximum = Math.max(maximum, number);
        }

        return maximum;
    }

    private static int findMin(int[] numbers) {
        int minimum = numbers[0];

        for (int number : numbers) {
            minimum = Math.min(minimum, number);
        }

        return minimum;
    }
}
