package com.javarush.task.task07.task0715;

import java.util.*;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        fill(words);

        printToConsole(words);
    }

    private static void fill(ArrayList<String> words) {
        Collections.addAll(words, "мама", "мыла", "раму");

        words.add(1, "именно");
        words.add(3, "именно");
        words.add(5, "именно");
    }

    private static void printToConsole(ArrayList<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}
