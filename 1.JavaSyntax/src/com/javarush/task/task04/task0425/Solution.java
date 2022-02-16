package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int abscissa = Integer.parseInt(reader.readLine());
        int ordinate = Integer.parseInt(reader.readLine());

        if ((abscissa > 0) && (ordinate > 0)) {
            System.out.println(1);
        }

        if ((abscissa < 0) && (ordinate > 0)) {
            System.out.println(2);
        }

        if ((abscissa < 0) && (ordinate < 0)) {
            System.out.println(3);
        }

        if ((abscissa > 0) && (ordinate < 0)) {
            System.out.println(4);
        }

        reader.close();
    }
}
