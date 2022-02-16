package com.javarush.task.task07.task0711;

import java.io.*;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();

        fillStrings(strings);

        processStrings(strings);

        printStrings(strings);
    }

    private static void fillStrings(ArrayList<String> strings) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int counter = 0; counter < 5; counter++) {
            strings.add(reader.readLine());
        }

        reader.close();
    }

    private static void processStrings(ArrayList<String> strings) {
        String lastString;

        for (int counter = 0; counter < 13; counter++) {
            lastString = strings.get(4);

            strings.remove(4);

            strings.add(0, lastString);
        }
    }

    private static void printStrings(ArrayList<String> strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
