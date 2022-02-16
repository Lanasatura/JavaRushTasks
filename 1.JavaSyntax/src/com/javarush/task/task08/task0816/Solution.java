package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Денисенко", dateFormat.parse("MARCH 11 1988"));
        map.put("Доброквашин", dateFormat.parse("AUGUST 11 1977"));
        map.put("Миронюк", dateFormat.parse("FEBRUARY 14 1994"));
        map.put("Жуганов", dateFormat.parse("SEPTEMBER 6 1989"));
        map.put("Меховский", dateFormat.parse("JANUARY 14 1994"));
        map.put("Петров", dateFormat.parse("DECEMBER 19 1991"));
        map.put("Denisenco", dateFormat.parse("JUNE 19 1984"));
        map.put("Войтюк", dateFormat.parse("JULY 8 1989"));
        map.put("Костогорова", dateFormat.parse("NOVEMBER 19 1989"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> person = iterator.next();

            Date dateOfBirth = person.getValue();

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateOfBirth);
            int month = calendar.get(Calendar.MONTH);

            if ((month > 4) && (month < 8)) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        /*Map<String, Date> people = createMap();

        removeAllSummerPeople(people);

        for (Map.Entry<String, Date> person : people.entrySet()) {
            System.out.println(person.getKey() + ": " + person.getValue());
        }*/
    }
}
