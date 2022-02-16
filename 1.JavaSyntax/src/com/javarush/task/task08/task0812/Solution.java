package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.*;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
    	//попробовать заменить на List?
        List<Integer> numbers = new ArrayList<>();

        fillList(numbers);

        /*for (int number: numbers) {
            System.out.println(number);
        }*/

        int maxSequenceLength = getMaxSequenceLength(numbers);

        System.out.println(maxSequenceLength);
    }

    private static int getMaxSequenceLength(List<Integer> numbers) {
        int maxSequenceLength = 1;
        int sequenceLength = 1;

        for (int index = 0; index < numbers.size() - 1; index++) {
            if (numbers.get(index).equals(numbers.get(index + 1))) {
                sequenceLength ++;

                maxSequenceLength = Math.max(maxSequenceLength, sequenceLength);
            }
            else {
                sequenceLength = 1;
            }
        }

        return maxSequenceLength;
    }

    private static void fillList(List<Integer> numbersList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int counter = 0; counter < 10; counter++) {
            int number = Integer.parseInt(reader.readLine());

            numbersList.add(number);
        }

        reader.close();
    }
}