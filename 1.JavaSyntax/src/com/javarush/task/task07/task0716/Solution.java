package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> wordsToRemove = new ArrayList<>();
        ArrayList<String> wordsToAdd = new ArrayList<>();

        for (String string : strings) {
            boolean containR = string.contains("р");
            boolean containL = string.contains("л");

            if (containR && !containL) {
                wordsToRemove.add(string);
            }

            if (!containR && containL) {
                wordsToAdd.add(string);
            }
        }

        for (String wordToRemove : wordsToRemove) {
            strings.remove(wordToRemove);
        }

        for (String wordToAdd : wordsToAdd) {
            int indexOfOriginalWord = strings.indexOf(wordToAdd);
            String wordToDouble = strings.get(indexOfOriginalWord);

            strings.add(indexOfOriginalWord + 1, wordToDouble);
        }
        return strings;
    }
}