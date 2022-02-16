package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] givenNumbers = new int[4];

        givenNumbers[0] = Integer.parseInt(reader.readLine());
        givenNumbers[1] = Integer.parseInt(reader.readLine());
        givenNumbers[2] = Integer.parseInt(reader.readLine());
        givenNumbers[3] = Integer.parseInt(reader.readLine());

        reader.close();

        System.out.println(getMaximumNumberIn(givenNumbers));
    }

    private static int getMaximumNumberIn(int[] givenNumbers) {
        int maximum = givenNumbers[0];

        for (int counter = 0; counter < givenNumbers.length - 1; counter++) {
            if (givenNumbers[counter + 1] >= maximum) {
                maximum = givenNumbers[counter + 1];
            }
        }

        return maximum;
    }
}
