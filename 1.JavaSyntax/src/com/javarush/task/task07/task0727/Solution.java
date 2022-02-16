package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();

        fill(reader, strings);

        ArrayList<String> resultStrings = getStringsChangedAccordingToNumberOfLetters(strings);

        printToConsole(resultStrings);
    }

    private static void fill(BufferedReader reader, ArrayList<String> strings) throws IOException {
        while (true) {
            String string = reader.readLine();

            if (string == null || string.isEmpty()) {
                break;
            }
            strings.add(string);
        }
    }

    private static ArrayList<String> getStringsChangedAccordingToNumberOfLetters(ArrayList<String> strings) {
        ArrayList<String> resultStrings = new ArrayList<>();

        for (String string : strings) {
            if (string.length() % 2 == 0) {
                resultStrings.add(string + " " + string);
            } else {
                resultStrings.add(string + " " + string + " " + string);
            }
        }
        return resultStrings;
    }

    private static void printToConsole(ArrayList<String> resultStrings) {
        for (String resultString : resultStrings) {
            System.out.println(resultString);
        }
    }

    private static ArrayList<String> getStringsToUpperCase(ArrayList<String> strings) {
        ArrayList<String> resultStrings = new ArrayList<String>();

        for (String string : strings) {
            resultStrings.add(string.toUpperCase());
        }
        return resultStrings;
    }
}
