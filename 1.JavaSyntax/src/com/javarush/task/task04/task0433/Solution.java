package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int linesCounter = 0;

        while (linesCounter < 10) {
            System.out.println(getLine());

            linesCounter++;
        }
    }

    static String getLine() {
        int columnsCounter = 0;
        String line = "";

        while (columnsCounter < 10) {
            line = line + "S";

            columnsCounter++;
        }
        return line;
    }
}
