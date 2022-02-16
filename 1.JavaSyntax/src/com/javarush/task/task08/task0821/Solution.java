package com.javarush.task.task08.task0821;

import java.util.*;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> people = new HashMap<>();

        people.put("Денисенко", "Светлана");
        people.put("Денисенко", "Андрей");
        people.put("Окунева", "Светлана");
        people.put("Войтюк", "Ольга");
        people.put("Гигина", "Анна");
        people.put("Триногина", "Юлия");
        people.put("Триногина", "Мария");
        people.put("Костогорова", "Диана");
        people.put("Пелипенко", "Юлия");
        people.put("Буряк", "Инна");

        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
