package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        byte thisCatVictoriesCount = 0;
        byte anotherCatVictoriesCount = 0;

        if (this.age > anotherCat.age) {
            thisCatVictoriesCount++;
        } else if (this.age < anotherCat.age) {
            anotherCatVictoriesCount++;
        }

        if (this.weight > anotherCat.weight) {
            thisCatVictoriesCount++;
        } else if (this.weight < anotherCat.weight) {
            anotherCatVictoriesCount++;
        }

        if (this.strength > anotherCat.strength) {
            thisCatVictoriesCount++;
        } else if (this.strength < anotherCat.strength) {
            anotherCatVictoriesCount++;
        }

        return thisCatVictoriesCount > anotherCatVictoriesCount;
    }

    public static void main(String[] args) {
        Cat rachel = new Cat();
        rachel.age = 1;
        rachel.weight = 2;
        rachel.strength = 100;

        Cat ruth = new Cat();
        ruth.age = 1;
        ruth.weight = 2;
        ruth.strength = 100;

        System.out.println(rachel.fight(ruth));
        System.out.println(ruth.fight(rachel));
    }
}
