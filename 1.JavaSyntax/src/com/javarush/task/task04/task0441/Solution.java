package com.javarush.task.task04.task0441;

/* 
Как-то средненько
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

        int maxNumber = getMaxFrom(givenNumbers);
        int minNumber = getMinFrom(givenNumbers);

        System.out.println(getAverage(givenNumbers, maxNumber, minNumber));

        reader.close();
    }

    private static int getAverage(int[] givenNumbers, int max, int min) {
        int averageNumber = Integer.MIN_VALUE;

        for (int givenNumber : givenNumbers) {
            if ((givenNumber != max) && (givenNumber != min)) {
                averageNumber = givenNumber;
            }
        }

        if ((givenNumbers[0] == givenNumbers[1]) && (givenNumbers[1] == givenNumbers[2])) {
            averageNumber = givenNumbers[0];
        }

        if ((givenNumbers[0] == givenNumbers[1]) ) {
            averageNumber = givenNumbers[0];
        }

        if ((givenNumbers[1] == givenNumbers[2]) ) {
            averageNumber = givenNumbers[1];
        }

        if ((givenNumbers[0] == givenNumbers[2]) ) {
            averageNumber = givenNumbers[2];
        }

        return averageNumber;
    }

    private static int getMaxFrom(int[] givenNumbers) {
        int maxNumber = Integer.MIN_VALUE;

        for (int number: givenNumbers) {
            maxNumber = Math.max(maxNumber, number);
        }

        return maxNumber;
    }

    private static int getMinFrom(int[] givenNumbers) {
        int minNumber = Integer.MAX_VALUE;

        for (int number: givenNumbers) {
            minNumber = Math.min(minNumber, number);
        }

        return minNumber;
    }
}
