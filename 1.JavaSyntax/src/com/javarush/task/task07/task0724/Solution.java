package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human firstGrandfather = new Human("Прокофий", true, 69);
        Human firstGrandmother = new Human("Зоя", false, 85);
        Human secondGrandfather = new Human("Владимир", true, 70);
        Human secondGrandmother = new Human("Лидия", false, 80);

        Human father = new Human("Александр", true, 62, firstGrandfather, firstGrandmother);
        Human mother = new Human("Галина", false, 59, secondGrandfather, secondGrandmother);

        Human son = new Human("Андрей", true, 35, father, mother);
        Human daughter = new Human("Светлана", false, 31, father, mother);

        Human cat = new Human("Мусавета", false, 15, father, mother);

        System.out.println(firstGrandfather);
        System.out.println(secondGrandfather);
        System.out.println(firstGrandmother);
        System.out.println(secondGrandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
        System.out.println(cat);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}