package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> cats = new HashMap<>();

        cats.put("Муся", new Cat("Муся"));
        cats.put("Пушок", new Cat("Пушок"));
        cats.put("Дымок", new Cat("Дымок"));
        cats.put("Белка", new Cat("Белка"));
        cats.put("Пуся", new Cat("Пуся"));
        cats.put("Мурчик", new Cat("Мурчик"));
        cats.put("Кот", new Cat("Кот"));
        cats.put("Рафик", new Cat("Рафик"));
        cats.put("Нельсон", new Cat("Нельсон"));
        cats.put("Агнешка", new Cat("Агнешка"));

        return  cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<>(map.values());

        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
