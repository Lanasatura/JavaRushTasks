package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int givenNumber = Integer.parseInt(reader.readLine());

        if (givenNumber == 0) {
            System.out.println("ноль");
        } else if (isAboveZero(givenNumber) && isEvenNumber(givenNumber)) {
            System.out.println("положительное четное число");
        } else if (isAboveZero(givenNumber) && !isEvenNumber(givenNumber)) {
            System.out.println("положительное нечетное число");
        } else if (!isAboveZero(givenNumber) && isEvenNumber(givenNumber)) {
            System.out.println("отрицательное четное число");
        } else if (!isAboveZero(givenNumber) && !isEvenNumber(givenNumber)) {
            System.out.println("отрицательное нечетное число");
        }

        reader.close();
    }

    private static boolean isAboveZero(int givenNumber) {
        return givenNumber > 0;
    }

    private static boolean isEvenNumber(int givenNumber) {
        return givenNumber % 2 == 0;
    }
}
