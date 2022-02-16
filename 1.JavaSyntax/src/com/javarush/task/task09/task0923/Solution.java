package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.*;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String userSentence = reader.readLine();

        String vowelsFromSentence = "";
        String otherCharactersFromSentence = "";

        for (Character character : userSentence.toCharArray()) {
            if (isVowel(character)) {
                vowelsFromSentence = vowelsFromSentence + character + " ";
            } else if (!Character.isWhitespace(character)){
                otherCharactersFromSentence = otherCharactersFromSentence + character + " ";
            }
        }

        System.out.println(vowelsFromSentence);
        System.out.println(otherCharactersFromSentence);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}