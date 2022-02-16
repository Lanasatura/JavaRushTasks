package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static final int LEGAL_AGE = 18;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String givenName = reader.readLine();
        int givenAge = Integer.parseInt(reader.readLine());

        checkIfMoreThanLegal(givenAge);

        reader.close();
    }

    private static void checkIfMoreThanLegal(int givenAge) {
        if (givenAge < LEGAL_AGE) {
            System.out.println("Подрасти еще");
        }
    }
}
