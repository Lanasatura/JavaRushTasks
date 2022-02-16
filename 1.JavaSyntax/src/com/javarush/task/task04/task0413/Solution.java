package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int givenDayOfWeek = Integer.parseInt(reader.readLine());

        switch (givenDayOfWeek) {
            case 1: printLine("понедельник");
            break;
            case 2: printLine("вторник");
            break;
            case 3: printLine("среда");
            break;
            case 4: printLine("четверг");
            break;
            case 5: printLine("пятница");
            break;
            case 6: printLine("суббота");
            break;
            case 7: printLine("воскресенье");
            break;
            default: printLine("такого дня недели не существует");
        }

        reader.close();
    }

    private static void printLine(String s) {
        System.out.println(s);
    }
}