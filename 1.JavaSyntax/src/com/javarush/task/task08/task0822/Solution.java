package com.javarush.task.task08.task0822;

import java.io.*;
import java.util.*;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        //System.out.println(integerList);
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        //int minNumber = Collections.min(array);

        /*Integer[] numbers = array.toArray(new Integer[array.size()]);

        int minNumber = Integer.MAX_VALUE;

        for (int index = 0; index < numbers.length - 1; index++) {
            minNumber = Math.min(minNumber, numbers[index]);
        }*/

        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> numbers = new LinkedList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sizeOfList = Integer.parseInt(reader.readLine());

        for (int counter = 0; counter < sizeOfList; counter++) {
            int number = Integer.parseInt(reader.readLine());

            numbers.add(number);
        }

        reader.close();

        return numbers;
    }
}
