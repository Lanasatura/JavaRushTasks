package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static final byte MINUTES_IN_ONE_HOUR = 60;
    public static final byte SECONDS_IN_ONE_MINUTE = 60;

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertToSeconds(2));
        System.out.println(convertToSeconds(6));
    }

    public static int convertToSeconds(int hour) {
        return hour * MINUTES_IN_ONE_HOUR * SECONDS_IN_ONE_MINUTE;
    }
}
