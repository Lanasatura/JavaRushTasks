package com.javarush.task.task07.task0701;

import java.io.*;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] numbers = new int[20];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = Integer.parseInt(reader.readLine());
        }

        return numbers;
    }

    public static int max(int[] array) {
        int maxNumber = array[0];

        for (int number : array) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        return maxNumber;
    }
}
