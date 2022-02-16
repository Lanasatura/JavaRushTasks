package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        System.out.println(getCountOfPositiveNumbers(givenNumbers));

        reader.close();
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
