package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lines = new ArrayList<>();

        int totalNumberOfLines = Integer.parseInt(reader.readLine());
        int numbersOfLinesToSwap = Integer.parseInt(reader.readLine());

        fill(reader, lines, totalNumberOfLines);

        swapFirstLines(lines, numbersOfLinesToSwap);

        printToConsole(lines);

        reader.close();
    }

    private static void swapFirstLines(ArrayList<String> lines, int numbersOfLinesToSwap) {
        String lineToSwap;

        for (int counter = 0; counter < numbersOfLinesToSwap; numbersOfLinesToSwap--) {
            lineToSwap = lines.get(counter);

            lines.remove(counter);

            lines.add(lineToSwap);
        }
    }

    private static void printToConsole(ArrayList<String> lines) {
        for (String line :lines) {
            System.out.println(line);
        }
    }

    private static void fill(BufferedReader reader, ArrayList<String> lines, int totalNumberOfLines) throws IOException {
        for (int counter = 0; counter < totalNumberOfLines; counter++) {
            lines.add(reader.readLine());
        }
    }
}
