package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] givenNumbers = new int[3];

        givenNumbers[0] = Integer.parseInt(reader.readLine());
        givenNumbers[1] = Integer.parseInt(reader.readLine());
        givenNumbers[2] = Integer.parseInt(reader.readLine());

        printSortedByDesc(givenNumbers);

        reader.close();
    }

    private static void printSortedByDesc(int[] givenNumbers) {
        sortByDesc(givenNumbers);

        System.out.println(givenNumbers[0] + " " + givenNumbers[1] + " " + givenNumbers[2]);
    }

    private static void sortByDesc(int[] givenNumbers) {
        for (int barrier = givenNumbers.length - 1; barrier >= 1; barrier--) {
            findMinimumAndSwipeIn(givenNumbers, barrier);
        }
    }

    private static void findMinimumAndSwipeIn(int[] givenNumbers, int barrier) {
        for (int index = 0; index < barrier; index++) {
            if (givenNumbers[index] < givenNumbers[index + 1]) {
                swapNumbersToFindMinimum(givenNumbers, index);
            }
        }
    }

    private static void swapNumbersToFindMinimum(int[] givenNumbers, int index) {
        int minimum = givenNumbers[index];
        givenNumbers[index] = givenNumbers[index + 1];
        givenNumbers[index + 1] = minimum;
    }
}
