package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //before
        //System.out.println(string);

        //after
        String[] words = string.split(" ");

        String changedString = "";

        for (String word : words) {
            String[] letters = word.split("");

            String upperCaseFirstLetter = letters[0].toUpperCase();
            letters[0] = upperCaseFirstLetter;

            String changedWord = "";

            for (String letter : letters) {
                changedWord = changedWord + letter;
            }

            changedString = changedString + " " + changedWord;
        }

        System.out.println(changedString.trim());
    }
}
