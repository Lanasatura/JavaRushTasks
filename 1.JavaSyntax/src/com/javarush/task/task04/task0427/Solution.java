package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int givenNumber = Integer.parseInt(reader.readLine());

        if (isNumberInRangeBetweenZeroAndHundred(givenNumber)) {
            describe(givenNumber);
        }

        reader.close();
    }

    private static boolean isNumberInRangeBetweenZeroAndHundred(int givenNumber) {
        return (givenNumber > 0) && (givenNumber < 1000);
    }

    private static void describe(int givenNumber) {
        if (getCountOfDigits(givenNumber) == 1) {
            if (isEvenNumber(givenNumber)) {
                System.out.println("четное однозначное число");
            } else {
                System.out.println("нечетное однозначное число");
            }
        }

        if (getCountOfDigits(givenNumber) == 2) {
            if (isEvenNumber(givenNumber)) {
                System.out.println("четное двузначное число");
            } else {
                System.out.println("нечетное двузначное число");
            }
        }

        if (getCountOfDigits(givenNumber) == 3) {
            if (isEvenNumber(givenNumber)) {
                System.out.println("четное трехзначное число");
            } else {
                System.out.println("нечетное трехзначное число");
            }
        }
    }

    private static boolean isEvenNumber(int givenNumber) {
        return givenNumber % 2 == 0;
    }

    private static byte getCountOfDigits(int givenNumber) {
        byte countOfDigits = 0;

        while (givenNumber > 0) {
            givenNumber = givenNumber / 10;

            countOfDigits ++;
        }

        return countOfDigits;
    }
}
