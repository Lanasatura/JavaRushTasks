package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        byte givenLinesCount = Byte.parseByte(reader.readLine());
        byte givenColumnsCount = Byte.parseByte(reader.readLine());

        for (int counter = 0; counter < givenLinesCount; counter++) {
            System.out.println(getLine(givenColumnsCount));
        }

        reader.close();
    }

    private static String getLine(byte columnsCount) {
        String line = "";

        for (int counter = 0; counter < columnsCount; counter++) {
            line = line + "8";
        }

        return line;
    }
}
