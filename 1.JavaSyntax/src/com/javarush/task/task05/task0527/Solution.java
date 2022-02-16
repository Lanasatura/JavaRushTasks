package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog butchDog = new Dog("Butch", 4, true);
        Cat tomCat = new Cat("Tom", 2, "grey");

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int age;
        boolean isBreed;

        public Dog(String name, int age, boolean isBreed) {
            this.name = name;
            this.age = age;
            this.isBreed = isBreed;
        }
    }

    public static class Cat {
        String name;
        int age;
        String color;

        public Cat(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }
    }
    //напишите тут ваш код
}
