package com.javarush.task.task07.task0722;

import java.io.*;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();

        fill(reader, strings);

        printToConsole(strings);

        reader.close();
    }

    private static void printToConsole(ArrayList<String> strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static void fill(BufferedReader reader, ArrayList<String> strings) throws IOException {
        while (true) {
            String line = reader.readLine();

            if (line.equals("end")) {
                break;
            } else {
                strings.add(line);
            }
        }
    }
}