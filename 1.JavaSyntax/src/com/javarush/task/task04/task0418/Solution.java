package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int firstGivenNumber = Integer.parseInt(reader.readLine());
        int secondGivenNumber = Integer.parseInt(reader.readLine());

        if (firstGivenNumber <= secondGivenNumber) {
            System.out.println(firstGivenNumber);
        } else {
            System.out.println(secondGivenNumber);
        }
    }
}