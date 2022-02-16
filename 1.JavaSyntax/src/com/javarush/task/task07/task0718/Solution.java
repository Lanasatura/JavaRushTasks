package com.javarush.task.task07.task0718;

import java.io.*;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> words = new ArrayList<>();

        fill(words);
        checkIfSortedByLength(words);
    }

    private static void fill(ArrayList<String> words) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int counter = 0; counter < 10; counter++) {
            words.add(reader.readLine());
        }

        reader.close();
    }

    private static void checkIfSortedByLength(ArrayList<String> words) {
        ArrayList<Integer> lengthsOfWords = new ArrayList<>();

        for (String word : words) {
            lengthsOfWords.add(word.length());
        }

        for (int index = 0; index < lengthsOfWords.size() - 1; index++) {
            if (lengthsOfWords.get(index) > lengthsOfWords.get(index + 1)) {
                System.out.println(index + 1);
                break;
            }
        }
    }
}

