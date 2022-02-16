package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String line = "8";

        for (int counter = 0; counter < 10; counter++) {
            System.out.println(line);

            line = line + "8";
        }
    }
}
