package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int givenYear = Integer.parseInt(reader.readLine());

        int daysInYear = getDaysInYear(givenYear);

        System.out.println("количество дней в году: " + daysInYear);

        reader.close();
    }

    private static int getDaysInYear(int year) {
        if ((year % 400) == 0) {
            return 366;
        } else if ((year % 100) == 0) {
            return 365;
        } else if ((year % 4) == 0) {
            return 366;
        } else {
            return 365;
        }
    }
}