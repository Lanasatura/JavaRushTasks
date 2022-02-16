package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.text.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
        /*System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));*/
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);

        Calendar calendarDate = new GregorianCalendar();
        calendarDate.setTime(simpleDateFormat.parse(date));

        int dayOfYear = calendarDate.get(Calendar.DAY_OF_YEAR);

        return dayOfYear % 2 != 0;
    }
}
