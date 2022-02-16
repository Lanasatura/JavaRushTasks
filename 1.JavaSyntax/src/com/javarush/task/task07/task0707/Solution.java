package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Bring ");
        list.add("me ");
        list.add("back ");
        list.add("to ");
        list.add("my ");

        System.out.println(list.size());

        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }
    }
}
