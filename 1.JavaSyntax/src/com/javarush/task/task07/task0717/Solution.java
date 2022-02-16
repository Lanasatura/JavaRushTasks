package com.javarush.task.task07.task0717;

import java.io.*;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();

        fill(list);

        ArrayList<String> result = doubleValues(list);

        printToConsole(result);
    }

    private static void fill(ArrayList<String> strings) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int counter = 0; counter < 10; counter++) {
            strings.add(reader.readLine());
        }

        reader.close();
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> doubleList = new ArrayList<>();

        for (String elementToAdd : list) {
            doubleList.add(elementToAdd);
            doubleList.add(elementToAdd);
        }
        return doubleList;
    }

    private static void printToConsole(ArrayList<String> result) {
        for (String element : result) {
            System.out.println(element);
        }
    }
}
