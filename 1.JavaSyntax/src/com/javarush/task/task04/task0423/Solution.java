package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String givenName = reader.readLine();
        int givenAge = Integer.parseInt(reader.readLine());

        checkIfMoreThanLegal(givenAge);

        reader.close();
    }

    private static void checkIfMoreThanLegal(int givenAge) {
        if (givenAge > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}
