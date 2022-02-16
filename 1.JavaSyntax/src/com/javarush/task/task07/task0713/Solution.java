package com.javarush.task.task07.task0713;

import java.io.*;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();

        ArrayList<Integer> multipleOfThreeNumbers = new ArrayList<>();
        ArrayList<Integer> multipleOfTwoNumbers = new ArrayList<>();
        ArrayList<Integer> allOtherNumbers = new ArrayList<>();

        fill(numbers);
        sortToLists(numbers, multipleOfThreeNumbers, multipleOfTwoNumbers, allOtherNumbers);

        printList(multipleOfThreeNumbers);
        printList(multipleOfTwoNumbers);
        printList(allOtherNumbers);
    }

    private static void fill(ArrayList<Integer> numbers) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int counter = 0; counter < 20; counter++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        reader.close();
    }

    public static void printList(ArrayList<Integer> list) {
        for (int listElement : list) {
            System.out.println(listElement);
        }
    }

    private static void sortToLists(ArrayList<Integer> numbers, ArrayList<Integer> multipleOfThreeNumbers,
                                    ArrayList<Integer> multipleOfTwoNumbers, ArrayList<Integer> allOtherNumbers) {
        for (int number : numbers) {
            if ((number % 2 != 0) && (number % 3 != 0)) {
                allOtherNumbers.add(number);
            } else if (number % 2 == 0) {
                multipleOfTwoNumbers.add(number);
            } if (number % 3 == 0) {
                multipleOfThreeNumbers.add(number);
            }
        }
    }
}
