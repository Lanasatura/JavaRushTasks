package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader readerBorderNumber = new BufferedReader(new InputStreamReader(System.in));

        int borderNumber = Integer.parseInt(readerBorderNumber.readLine());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int counter = 0;

        while (true) {
            int number = Integer.parseInt(reader.readLine());
            maximum = Math.max(maximum, number);
            counter++;

            if (counter == borderNumber) {
                break;
            }
        }

        //напишите тут ваш код

        System.out.println(maximum);

        readerBorderNumber.close();
        reader.close();
    }
}
