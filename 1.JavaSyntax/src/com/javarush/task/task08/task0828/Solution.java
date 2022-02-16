package com.javarush.task.task08.task0828;

import java.io.*;
import java.text.*;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String monthName = reader.readLine();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM", Locale.ENGLISH);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(simpleDateFormat.parse(monthName));

        Integer monthNumber = calendar.get(Calendar.MONTH) + 1;

        Map<String, Integer> months = new HashMap<>();

        months.put(monthName, monthNumber);

        for (Map.Entry<String, Integer> month : months.entrySet()) {
            System.out.println(month.getKey() + " is the " + month.getValue() + " month");
        }
    }
}
