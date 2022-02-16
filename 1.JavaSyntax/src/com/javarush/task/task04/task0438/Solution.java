package com.javarush.task.task04.task0438;

/* 
Рисуем линии
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        printHorizontalLine();
        printVerticalLine();
    }

    private static void printHorizontalLine() {
        String line = "";

        for (int counter = 0; counter < 10; counter++) {
            line = line + "8";
        }

        System.out.println(line);
    }

    private static void printVerticalLine() {
        for (int counter = 0; counter < 10; counter++) {
            System.out.println("8");
        }
    }
}
