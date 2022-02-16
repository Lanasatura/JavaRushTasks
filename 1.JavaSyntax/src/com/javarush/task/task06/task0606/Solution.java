package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int givenNumber = Integer.parseInt(reader.readLine());

        calculateCountOfEvenAndOddNumbers(givenNumber);

        System.out.println("Even: " + even + " Odd: " + odd);

        reader.close();
    }

    private static void calculateCountOfEvenAndOddNumbers(int givenNumber) {
        while (givenNumber > 0) {
            if (givenNumber % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            givenNumber = givenNumber / 10;
        }
    }
}
