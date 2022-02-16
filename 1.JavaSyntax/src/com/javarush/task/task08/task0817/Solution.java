package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> people = new HashMap<>();

        people.put("Сталлоне", "Сильвестр");
        people.put("Денисенко", "Светлана");
        people.put("Доброквашин", "Евгений");
        people.put("Миронюк", "Олег");
        people.put("Жуганов", "Григорий");
        people.put("Меховский", "Алексей");
        people.put("Петров", "Владимир");
        people.put("Denisenco", "Светлана");
        people.put("Войтюк", "Ольга");
        people.put("Костогорова", "Диана");

        return people;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copyMapForIteration = new HashMap<>(map);
        Map<String, String> copyMapForCheckUp = new HashMap<>(map);

        for (Map.Entry<String, String> person : copyMapForIteration.entrySet()) {
            String firstName = person.getValue();

            copyMapForCheckUp.remove(person.getKey());

            if (copyMapForCheckUp.containsValue(firstName)) {
                removeItemFromMapByValue(map, firstName);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);

        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        /*Map<String, String> people = createMap();

        removeTheFirstNameDuplicates(people);

        for (Map.Entry<String, String> person : people.entrySet()) {
            System.out.println(person.getKey() + ": " + person.getValue());
        }*/
    }
}
