package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        double firstPrice = convertEurToUsd(35, 0.5);
        double secondPrice = convertEurToUsd(20, 0.5);

        System.out.println(firstPrice);
        System.out.println(secondPrice);
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        return eur * course;
    }
}
