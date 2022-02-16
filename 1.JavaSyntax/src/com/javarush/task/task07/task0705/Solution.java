package com.javarush.task.task07.task0705;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[20];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = Integer.parseInt(reader.readLine());
        }

        int[] firstHalf = new int[10];

        for (int firstHalfCounter = 0; firstHalfCounter < (numbers.length / 2); firstHalfCounter++) {
            firstHalf[firstHalfCounter] = numbers[firstHalfCounter];
        }

        int[] secondHalf = new int[10];

        for (int secondHalfCounter = numbers.length / 2; secondHalfCounter < numbers.length; secondHalfCounter++) {
            secondHalf[secondHalfCounter - numbers.length / 2] = numbers[secondHalfCounter];
        }

        for (int number : secondHalf) {
            System.out.println(number);
        }
    }
}
