package com.javarush.task.task08.task0819;

import java.util.*;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        cats.remove(cats.iterator().next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2

        Set<Cat> cats = new HashSet<>();

        Cat musya = new Cat();
        Cat ksyusha = new Cat();
        Cat morris = new Cat();

        cats.add(musya);
        cats.add(ksyusha);
        cats.add(morris);

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1
    public static class Cat {

    }
}