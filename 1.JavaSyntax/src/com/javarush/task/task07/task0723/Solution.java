package com.javarush.task.task07.task0723;

/* 
Обратный отсчёт
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        for (int counter = 30; counter >= 0; counter--) {
            System.out.println(counter);

            Thread.sleep(100);
        }

        System.out.println("Бум!");
    }
}
