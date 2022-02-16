package com.javarush.task.task07.task0703;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[10];
        String[] lines = new String[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int index = 0; index < lines.length; index++) {
            lines[index] = reader.readLine();
            numbers[index] = lines[index].length();
        }

        for (int number: numbers) {
            System.out.println(number);
        }

        reader.close();
    }
}
