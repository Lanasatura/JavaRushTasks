package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg firstZerg = new Zerg();
        firstZerg.name = "Sveta";
        Zerg secondZerg = new Zerg();
        secondZerg.name = "Zhenya";
        Zerg thirdZerg = new Zerg();
        thirdZerg.name = "Oleg";
        Zerg fourthZerg = new Zerg();
        fourthZerg.name = "Grisha";
        Zerg fifthZerg = new Zerg();
        fifthZerg.name = "Lesha";

        Protoss firstProtoss = new Protoss();
        firstProtoss.name = "Vova";
        Protoss secondProtoss = new Protoss();
        secondProtoss.name = "Olya";
        Protoss thirdProtoss = new Protoss();
        thirdProtoss.name = "Misha";

        Terran firstTerran = new Terran();
        firstTerran.name = "Kostya";
        Terran secondTerran = new Terran();
        secondTerran.name = "Sasha";
        Terran thirdTerran = new Terran();
        thirdTerran.name = "Aida";
        Terran fourthTerran = new Terran();
        fourthTerran.name = "Pasha";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
