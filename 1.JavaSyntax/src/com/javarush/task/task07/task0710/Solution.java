package com.javarush.task.task07.task0710;

import java.io.*;
import java.util.*;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();

        fillStrings(strings);

        printStrings(strings);
    }

    private static void fillStrings(ArrayList<String> strings) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int index = 0; index < 10; index++) {
            strings.add(strings.size() - index, reader.readLine());
        }

        reader.close();
    }

    private static void printStrings(ArrayList<String> strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
