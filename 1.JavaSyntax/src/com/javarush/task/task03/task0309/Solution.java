package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        getSumIntegersTill(5);
    }

    private static void getSumIntegersTill(int number) {
        int sum = 0;

        for (int counter = 1; counter < number + 1; counter++) {
            sum = sum + counter;
            System.out.println(sum);
        }
    }
}
