package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());

        if ((firstNumber == secondNumber) && (firstNumber == thirdNumber)) {
            System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " " + secondNumber);
        } else if (firstNumber == thirdNumber) {
            System.out.println(firstNumber + " " + thirdNumber);
        } else if (secondNumber == thirdNumber) {
            System.out.println(secondNumber + " " + thirdNumber);
        }

        reader.close();
    }
}