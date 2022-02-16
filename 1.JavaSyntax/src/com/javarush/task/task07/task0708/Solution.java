package com.javarush.task.task07.task0708;

import java.io.*;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();

        fillStrings();

        ArrayList<String> stringsWithMaxLength = new ArrayList<>();

        fillStringsWithMaxLength(stringsWithMaxLength);

        for (String string : stringsWithMaxLength) {
            System.out.println(string);
        }
    }

    private static void fillStrings() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int index = 0; index < 5; index++) {
            strings.add(reader.readLine());
        }

        reader.close();
    }

    private static void fillStringsWithMaxLength(ArrayList<String> stringsWithMaxLength) {
        String maxLengthString = "";

        for (String string : strings) {
            if (string.length() > maxLengthString.length()) {
                maxLengthString = string;
            }
        }

        for (String string : strings) {
            if (string.length() == maxLengthString.length()) {
                stringsWithMaxLength.add(string);
            }
        }
    }
}
