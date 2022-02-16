package com.javarush.task.task07.task0704;

import java.io.*;/*
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = Integer.parseInt(reader.readLine());
        }

        for (int counter = numbers.length - 1; counter >= 0; counter--) {
            System.out.println(numbers[counter]);
        }

        reader.close();
    }
}

