package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        byte periodInYears = inputPeriodInYears();
        String name = inputName();

        System.out.println(name + " захватит мир через " + periodInYears + " лет. Му-ха-ха!");
    }

    private static String inputName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();
    }

    private static byte inputPeriodInYears() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return Byte.parseByte(reader.readLine());
    }
}