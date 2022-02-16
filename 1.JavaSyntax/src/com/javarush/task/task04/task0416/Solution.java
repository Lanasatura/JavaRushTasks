package com.javarush.task.task04.task0416;

/*
Переходим дорогу вслепую
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double minutesSinceTheBeginningOfHour = Float.parseFloat(reader.readLine());

        double restOfDivideToTen = minutesSinceTheBeginningOfHour % 10;

        if (((restOfDivideToTen >= 3) && (restOfDivideToTen < 4)) ||
            (restOfDivideToTen >= 8) && (restOfDivideToTen < 9)) {
            System.out.println("жёлтый");
        } else if (((restOfDivideToTen >= 4) && (restOfDivideToTen < 5)) ||
            (restOfDivideToTen >= 9) && (restOfDivideToTen < 10)) {
            System.out.println("красный");
        } else if (((restOfDivideToTen >= 0) && (restOfDivideToTen < 3)) ||
            (restOfDivideToTen >= 5) && (restOfDivideToTen < 8)) {
            System.out.println("зелёный");
        }

        reader.close();
    }
}

/*public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();

        double r = Double.parseDouble(s1);
        double t = r % 5.0;

        if (t >= 0 && t < 3.0) {
            System.out.println("зелёный");
        }
        if (t >= 3.0 && t < 4) {
            System.out.println("жёлтый");
        }
        if (t >= 4.0 && t < 5.0) {
            System.out.println("красный");
        }
    }
}*/
