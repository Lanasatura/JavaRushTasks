package com.javarush.task.task04.task0435;

/* 
Четные числа
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int counter = 1; counter <= 100; counter++) {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }
        }
    }
}
