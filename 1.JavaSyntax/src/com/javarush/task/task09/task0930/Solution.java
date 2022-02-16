package com.javarush.task.task09.task0930;

import java.io.*;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        for (int barrier = array.length - 1; barrier >= 1; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (isNumber(array[index])) {
                    sortNumbers(array, index, barrier);
                } else {
                    sortStrings(array, index, barrier);
                }
            }
        }
    }

    private static void sortNumbers(String[] array, int index, int barrier) {
        int anotherNumberIndex = index + 1;

        while (anotherNumberIndex <= barrier) {
            if (isNumber(array[anotherNumberIndex])) {
                if (Integer.parseInt(array[index]) < Integer.parseInt(array[anotherNumberIndex])) {
                    swap(array, index, anotherNumberIndex);
                }
                break;
            } else {
                anotherNumberIndex++;
            }
        }
    }

    private static void sortStrings(String[] array, int index, int barrier) {
        int anotherStringIndex = index + 1;

        while (anotherStringIndex <= barrier) {
            if (! isNumber(array[anotherStringIndex])) {
                if (isGreaterThan(array[index], array[anotherStringIndex])) {
                    swap(array, index, anotherStringIndex);
                }
                break;
            } else {
                anotherStringIndex++;
            }
        }
    }

    private static void swap(String[] array, int index, int anotherNumberIndex) {
        String temp = array[index];
        array[index] = array[anotherNumberIndex];
        array[anotherNumberIndex] = temp;
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
