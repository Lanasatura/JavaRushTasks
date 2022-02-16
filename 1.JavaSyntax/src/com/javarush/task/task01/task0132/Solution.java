package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));

        /*System.out.println(546 % 100);
        System.out.println(546 / 100);*/
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        /*int hundredsDigital = number / 100;
        int restFromDividingOnHundred = number % 100;
        int tensDigital = restFromDividingOnHundred / 10;
        int numbersDigital = restFromDividingOnHundred % 10;

        return hundredsDigital + tensDigital + numbersDigital*/

        int sumDigits = 0;

        for ( ; number > 0; number = number / 10) {
            sumDigits = sumDigits + number % 10;
        }

        return sumDigits;
    }
}