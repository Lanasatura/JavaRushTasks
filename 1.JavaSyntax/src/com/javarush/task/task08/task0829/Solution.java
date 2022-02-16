package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> readList = new ArrayList<>();

        while (true) {
            String line = reader.readLine();

            if (line.isEmpty()) {
                break;
            }

            readList.add(line);
        }

        Map<String, String> familiesAndCities = new HashMap<>();

        for (int index = 0; index < readList.size() - 1; index = index + 2) {
            familiesAndCities.put(readList.get(index), readList.get(index + 1));
        }

        String city = reader.readLine();

        if (!city.isEmpty()) {
            String familyName = familiesAndCities.get(city);

            System.out.println(familyName);
        }
    }
}
