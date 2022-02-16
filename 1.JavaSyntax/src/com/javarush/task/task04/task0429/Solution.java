package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
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

        System.out.println("количество отрицательных чисел: " + getCountOfNegativeNumbers(givenNumbers));
        System.out.println("количество положительных чисел: " + getCountOfPositiveNumbers(givenNumbers));

        reader.close();
    }

    private static byte getCountOfNegativeNumbers(int[] givenNumbers) {
        byte countOfNegativeNumbers = 0;

        for (int number: givenNumbers) {
            if (number < 0) {
                countOfNegativeNumbers++;
            }
        }

        return countOfNegativeNumbers;
    }

    private static byte getCountOfPositiveNumbers(int[] givenNumbers) {
        byte countOfPositiveNumbers = 0;

        for (int number: givenNumbers) {
            if (number > 0) {
                countOfPositiveNumbers++;
            }
        }

        return countOfPositiveNumbers;
    }
}
