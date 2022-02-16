package com.javarush.task.task03.task0322;

/* 
Большая и чистая
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String firstName = getName();
        String secondName = getName();
        String thirdName = getName();

        System.out.println(firstName + " + " + secondName + " + " + thirdName + " = Чистая любовь, да-да!");
        //Вася + Ева + Анжелика = Чистая любовь, да-да!
    }

    private static String getName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();
    }
}