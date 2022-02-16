package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name = getName();
        int salaryInRubles = getSalaryInRubles();
        int periodInYears = getPeriodInYears();

        System.out.println(name + " получает " + salaryInRubles + " через " + periodInYears + " лет.");
    }

    private static String getName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();
    }

    private static int getSalaryInRubles() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return Integer.parseInt(reader.readLine());
    }

    private static int getPeriodInYears() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return Integer.parseInt(reader.readLine());
    }
}
