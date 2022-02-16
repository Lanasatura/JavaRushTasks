package com.javarush.task.task07.task0719;

import java.io.*;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int index = 0; index < 10; index++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        for (int index = 0; index < numbers.size(); index++) {
            System.out.println(numbers.get(numbers.size() - index - 1));
        }

        reader.close();
    }
}
