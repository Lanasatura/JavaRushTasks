package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        long factorialResult = getFactorial(10);
        System.out.println(factorialResult);
    }

    private static long getFactorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * getFactorial(number - 1);
    }
}
