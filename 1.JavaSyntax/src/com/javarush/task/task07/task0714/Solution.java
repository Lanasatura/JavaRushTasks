package com.javarush.task.task07.task0714;

import java.io.*;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();

        fillStrings(strings);

        strings.remove(2);

        printInverseStrings(strings);
    }

	private static void fillStrings(ArrayList<String> strings) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int counter = 0; counter < 5; counter++) {
			strings.add(reader.readLine());
		}

		reader.close();
	}

	private static void printInverseStrings(ArrayList<String> strings) {
		for (int counter = 0; counter < strings.size(); counter++) {
			int index = strings.size() - counter - 1;

			System.out.println(strings.get(index));
		}
	}
}
