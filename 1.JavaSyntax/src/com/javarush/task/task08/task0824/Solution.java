package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human brother = new Human("Андрей", true, 35, new ArrayList<Human>());
        Human sister = new Human("Светлана", false, 32, new ArrayList<Human>());
        Human cat = new Human("Муся", false, 15, new ArrayList<Human>());

        ArrayList<Human> grandchildren = new ArrayList<>();
        grandchildren.add(brother);
        grandchildren.add(sister);
        grandchildren.add(cat);

        Human father = new Human("Александр", true, 62, grandchildren);

        ArrayList<Human> childrenFromDadSide = new ArrayList<>();
        childrenFromDadSide.add(father);

        Human mother = new Human("Галина", false, 59, grandchildren);

        ArrayList<Human> childrenFromMomSide = new ArrayList<>();
        childrenFromMomSide.add(mother);

        Human grandfatherFromMomSide = new Human("Владимир", true, 68, childrenFromMomSide);
        Human grandmotherFromMomSide = new Human("Лидия", false, 80, childrenFromMomSide);

        Human grandfatherFromDadSide = new Human("Прокофий", true, 69, childrenFromDadSide);
        Human grandmotherFromDadSide = new Human("Зоя", false, 85, childrenFromDadSide);

        System.out.println(grandfatherFromDadSide);
        System.out.println(grandfatherFromMomSide);
        System.out.println(grandmotherFromDadSide);
        System.out.println(grandmotherFromMomSide);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(brother);
        System.out.println(sister);
        System.out.println(cat);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
