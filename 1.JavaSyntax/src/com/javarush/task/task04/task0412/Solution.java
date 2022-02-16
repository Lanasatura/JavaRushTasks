package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputedNumber = Integer.parseInt(reader.readLine());

        if (inputedNumber > 0) {
            inputedNumber = inputedNumber * 2;

            System.out.println(inputedNumber);
        } else if (inputedNumber < 0) {
            inputedNumber++;

            System.out.println(inputedNumber);
        } else {
            System.out.println(inputedNumber);
        }
    }
}