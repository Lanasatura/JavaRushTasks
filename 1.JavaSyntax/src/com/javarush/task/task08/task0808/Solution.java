package com.javarush.task.task08.task0808;

import java.util.*;

/* 
10 тысяч удалений и вставок
*/

public class Solution {
    public static void main(String[] args) {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        for (int counter = 0; counter < 10000; counter++) {
            list.add(counter, new Object());
        }
    }

    public static void get10000(List list) {
        for (int counter = 0; counter < 10000; counter++) {
            list.get(counter);
        }
    }

    public static void set10000(List list) {
        for (int counter = 0; counter < 10000; counter++) {
            list.set(counter, new Object());
        }
    }

    public static void remove10000(List list) {
        list.removeAll(list);
        /*Iterator listIterator = list.iterator();

        while (listIterator.hasNext()) {
            listIterator.remove();
        }*/

        /*for (int counter = 0; counter < 10000; counter++) {
            list.remove(counter);
        }*/
    }
}
