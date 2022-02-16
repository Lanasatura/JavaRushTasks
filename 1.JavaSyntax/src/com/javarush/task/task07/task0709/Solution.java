package com.javarush.task.task07.task0709;

import java.io.*;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();

        fillStrings(strings);

        ArrayList<String> shortestStrings = new ArrayList<>();

        fillShortestStrings(shortestStrings, strings);

        printShortestStrings(shortestStrings);
    }

    private static void fillStrings(ArrayList<String> strings) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int counter = 0; counter < 5; counter++) {
            strings.add(reader.readLine());
        }

        reader.close();
    }

    private static void fillShortestStrings(ArrayList<String> shortestStrings, ArrayList<String> strings) {
        String shortestString = strings.get(0);

        for (String string : strings) {
            if (string.length() < shortestString.length()) {
                shortestString = string;
            }
        }

        for (String string : strings) {
            if (string.length() == shortestString.length()) {
                shortestStrings.add(string);
            }
        }
    }

    private static void printShortestStrings(ArrayList<String> shortestStrings) {
        for (String string: shortestStrings) {
            System.out.println(string);
        }
    }
}
