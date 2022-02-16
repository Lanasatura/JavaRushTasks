package com.javarush.task.task07.task0728;

import java.io.*;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[5];

        for (int index = 0; index < 5; index++) {
            array[index] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    /*public static void sort(int[] array) {
        Arrays.sort(array);
    }*/

    public static void sort(int[] array) {
        int gapBetweenElements = array.length / 2;

        while(gapBetweenElements >= 1) {
            for (int rightBorder = 0; rightBorder < array.length; rightBorder++) {
                for (int index = rightBorder - gapBetweenElements; index >= 0 ; index -= gapBetweenElements) {
                    if (array[index] < array[index + gapBetweenElements]) {
                        swap(array, index, index + gapBetweenElements);
                    }
                }
            }
            gapBetweenElements = gapBetweenElements / 2;
        }
    }

    private static void swap(int[] numbers, int firstIndex, int secondIndex) {
        int temp = numbers[firstIndex];
        numbers[firstIndex] = numbers[secondIndex];
        numbers[secondIndex] = temp;
    }
}
