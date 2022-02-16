package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> people = new HashMap<>();

        people.put("Денисенко", "Светлана");
        people.put("Доброквашин", "Евгений");
        people.put("Миронюк", "Олег");
        people.put("Жуганов", "Григорий");
        people.put("Меховский", "Алексей");
        people.put("Петров", "Владимир");
        people.put("Войтюк", "Ольга");
        people.put("Костогорова", "Диана");
        people.put("Буряк", "Инна");
        people.put("Окунева", "Светлана");

        return people;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int countTheSameFirstName = 0;

        for (Map.Entry<String, String> person : map.entrySet()) {
            if (person.getValue().equals(name)) {
                countTheSameFirstName++;
            }
        }

        return countTheSameFirstName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countTheSameLastName = 0;

        for (Map.Entry<String, String> person : map.entrySet()) {
            if (person.getKey().equals(lastName)) {
                countTheSameLastName++;
            }
        }

        return countTheSameLastName;
    }

    public static void main(String[] args) {
        Map<String, String> people = createMap();

        System.out.println(getCountTheSameFirstName(people, "Светлана"));
        System.out.println(getCountTheSameLastName(people, "Денисенко"));
    }
}
