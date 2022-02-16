package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());
        int fourthNumber = Integer.parseInt(reader.readLine());
        int fifthNumber = Integer.parseInt(reader.readLine());

        int minimum = min(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);

        System.out.println("Minimum = " + minimum);

        reader.close();
    }

    public static int min(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
        int[] givenNumbers = new int[5];

        givenNumbers[0] = firstNumber;
        givenNumbers[1] = secondNumber;
        givenNumbers[2] = thirdNumber;
        givenNumbers[3] = fourthNumber;
        givenNumbers[4] = fifthNumber;

        int minimumNumber = Integer.MAX_VALUE;

        for (int counter = 0; counter < givenNumbers.length - 1; counter++) {
            minimumNumber = Math.min(
                Math.min(givenNumbers[counter], givenNumbers[counter + 1]),
                minimumNumber);
        }
        return minimumNumber;
    }
}
