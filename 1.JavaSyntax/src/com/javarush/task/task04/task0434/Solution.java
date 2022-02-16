package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static final int BORDER_NUMBER = 10;

    public static void main(String[] args) {
        //напишите тут ваш код
        int lineCounter = 1;

        while (lineCounter <= BORDER_NUMBER) {
            printLine(lineCounter);
            lineCounter++;
        }
    }

    private static void printLine(int coefficient) {
        int columnCounter = 1;
        String line = "";

        while (columnCounter <= BORDER_NUMBER) {
            line = line + " " + columnCounter * coefficient;
            columnCounter++;
        }

        System.out.println(line);
    }
}
