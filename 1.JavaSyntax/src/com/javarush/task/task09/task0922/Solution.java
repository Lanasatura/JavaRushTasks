package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String givenLine = reader.readLine();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date givenDate = simpleDateFormat.parse(givenLine);

        simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(simpleDateFormat.format(givenDate).toUpperCase());
    }
}
