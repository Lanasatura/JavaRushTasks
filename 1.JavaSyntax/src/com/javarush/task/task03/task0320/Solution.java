package com.javarush.task.task03.task0320;

/* 
Скромность украшает программиста
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name = getName();

        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }

    private static String getName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();
    }
}
