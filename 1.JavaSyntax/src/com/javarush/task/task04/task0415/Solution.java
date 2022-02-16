package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int firstSide = Integer.parseInt(reader.readLine());
        int secondSide = Integer.parseInt(reader.readLine());
        int thirdSide = Integer.parseInt(reader.readLine());

        if (ifOneSideIsBiggerThanSumOfOthers(firstSide, secondSide, thirdSide)) {
            System.out.println("Треугольник не существует.");
        } else {
            System.out.println("Треугольник существует.");
        }

        reader.close();
    }

    private static boolean ifOneSideIsBiggerThanSumOfOthers(int a, int b, int c) {
        return (a >= (b + c)) || (b >= (a + c)) || (c >= (a + b));
    }
}