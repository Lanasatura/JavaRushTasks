package com.javarush.task.task08.task0814;

import java.util.*;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> numbers = new HashSet<>();

        for (int counter = 0; counter < 20; counter++) {
            numbers.add(counter);
        }
        return numbers;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {

        /*while (iterator.hasNext()) {
            int number = iterator.next();

            if (number > 10) {
                iterator.remove();
            }
        }*/

        set.removeIf(number -> number > 10);

        return set;
    }

    public static void main(String[] args) {
        /*Set<Integer> numbers = createSet();

        Set<Integer> numbersLessThan10 = removeAllNumbersGreaterThan10(numbers);

        for (int number : numbersLessThan10) {
            System.out.println(number);
        }*/
    }
}
