package com.javarush.task.task07.task0712;

import java.io.*;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();

        fillStrings(strings);
        String firstShortestOrLongestString = getFirstShortestOrLongestString(strings);

		System.out.println(firstShortestOrLongestString);
    }

	private static void fillStrings(ArrayList<String> strings) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int counter = 0; counter < 10; counter++) {
			strings.add(reader.readLine());
		}

		reader.close();
	}

	private static String getFirstShortestOrLongestString(ArrayList<String> strings) {
		String shortestString = getShortestString(strings);
		String longestString = getLongestString(strings);

		int resultIndex;
		int shortestIndex = 0;
		int longestIndex = 0;

		for (int counter = 0; counter < strings.size(); counter++) {
			if (strings.get(counter).equals(shortestString)) {
				shortestIndex = counter;
			}
		}

		for (int counter = 0; counter < strings.size(); counter++) {
			if (strings.get(counter).equals(longestString)) {
				longestIndex = counter;
			}
		}

		resultIndex = Math.min(shortestIndex, longestIndex);

		return strings.get(resultIndex);
	}

	private static String getShortestString(ArrayList<String> strings) {
		String shortestString = strings.get(0);

		for (String string : strings) {
			if (string.length() < shortestString.length()) {
				shortestString = string;
			}
		}
		return shortestString;
	}

	private static String getLongestString(ArrayList<String> strings) {
		String longestString = strings.get(0);

		for (String string : strings) {
			if (string.length() > longestString.length()) {
				longestString = string;
			}
		}
		return longestString;
	}
}
