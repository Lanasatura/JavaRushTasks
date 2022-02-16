package com.javarush.task.task07.task0702;

import java.io.*;/*
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] linesList = new String[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int index = 0; index < linesList.length - 2; index++) {
            linesList[index] = reader.readLine();
        }

        for (int counter = linesList.length - 1; counter >= 0; counter--) {
            System.out.println(linesList[counter]);
        }

        reader.close();
    }
}