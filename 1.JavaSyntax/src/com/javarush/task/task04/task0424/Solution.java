package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] givenNumbers = new int[3];

        givenNumbers[0] = Integer.parseInt(reader.readLine());
        givenNumbers[1] = Integer.parseInt(reader.readLine());
        givenNumbers[2] = Integer.parseInt(reader.readLine());

        if (givenNumbers[0] == givenNumbers[1]) {
            System.out.println(3);
        } else if (givenNumbers[1] == givenNumbers[2]) {
            System.out.println(1);
        } else if (givenNumbers[0] == givenNumbers[2]) {
            System.out.println(2);
        }

        reader.close();
    }
}
