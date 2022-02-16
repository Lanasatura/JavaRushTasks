package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> readNumbersList = new ArrayList<>();

        while (true) {
            try {
                String line  = reader.readLine();

                if (line.isEmpty()) {
                    break;
                }

                readNumbersList.add(Integer.parseInt(line));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException exc) {
                for (Integer number : readNumbersList) {
                    System.out.println(number);
                }
            }
        }
    }
}
