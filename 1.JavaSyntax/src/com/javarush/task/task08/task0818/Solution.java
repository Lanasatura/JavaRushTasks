package com.javarush.task.task08.task0818;

import java.util.*;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> employees = new HashMap<>();

        employees.put("Denisenko", 1000);
        employees.put("Dobrokvashin", 1000);
        employees.put("Mironyuk", 800);
        employees.put("Zhuganov", 500);
        employees.put("Mehovsky", 500);
        employees.put("Petrov", 400);
        employees.put("Kostogorova", 400);
        employees.put("Voytyuk", 800);
        employees.put("Stalonne", 1500);
        employees.put("X", 1100);

        return employees;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copyEmployees = new HashMap<>(map);

        for (Map.Entry<String, Integer> employee : copyEmployees.entrySet()) {
            if (employee.getValue() < 500) {
                map.remove(employee.getKey());
            }
        }
    }

    public static void main(String[] args) {
        /*Map<String, Integer> employees = createMap();

        removeItemFromMap(employees);

        for (Map.Entry<String, Integer> employee : employees.entrySet()) {
            System.out.println(employee.getKey() + ": " + employee.getValue());
        }*/
    }
}