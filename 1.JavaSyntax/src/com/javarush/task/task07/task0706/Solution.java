package com.javarush.task.task07.task0706;

import java.io.*;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] houses = new int[15];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int index = 0; index < houses.length; index++) {
            houses[index] = Integer.parseInt(reader.readLine());
        }

        int evenHousesPopulation = 0;
        int oddHousesPopulation = 0;

        for (int counter = 0; counter < houses.length; counter++) {
            if (counter % 2 == 0) {
                evenHousesPopulation += houses[counter];
            } else {
                oddHousesPopulation += houses[counter];
            }

            //System.out.println(counter + " even:  " + evenHousesPopulation + " odd: " + oddHousesPopulation);
        }

        String resultText = (evenHousesPopulation > oddHousesPopulation) ? "В домах с четными номерами проживает " +
            "больше жителей." : "В домах с нечетными номерами проживает больше жителей.";

        System.out.println(resultText);

        reader.close();
    }
}
