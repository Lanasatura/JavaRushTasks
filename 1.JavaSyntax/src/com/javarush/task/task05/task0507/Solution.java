package com.javarush.task.task05.task0507;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int counter = 0;

        while (true) {
            int number = Integer.parseInt(reader.readLine());

            if (number == -1) {
                break;
            } else {
                counter++;
                sum += number;
            }
        }

        System.out.println((double) sum / counter);

        reader.close();
    }
}

