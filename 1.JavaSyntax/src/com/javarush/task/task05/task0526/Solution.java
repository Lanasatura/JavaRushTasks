package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
		Man firstMan = new Man("Олег", 25, "Медвёдовская");
		Man secondMan = new Man("Женя", 42, "Краснодар");

		Woman firstWoman = new Woman("Света", 31, "Роговская");
		Woman secondWoman = new Woman("Диана", 30, "Дубай");

		System.out.println(firstMan.name + " " + firstMan.age + " " + firstMan.address);
		System.out.println(secondMan.name + " " + secondMan.age + " " + secondMan.address);

		System.out.println(firstWoman.name + " " + firstWoman.age + " " + firstWoman.address);
		System.out.println(secondWoman.name + " " + secondWoman.age + " " + secondWoman.address);
    }

    public static class Man {
    	private String name;
    	private int age;
    	private String address;

    	public Man(String name) {
    		this.name = name;
		}

		public Man(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public Man(String name, int age, String address) {
			this.name = name;
			this.age = age;
			this.address = address;
		}

		public Man(String name, String address) {
			this.name = name;
			this.address = address;
		}

		public Man(int age, String address) {
			this.age = age;
			this.address = address;
		}
	}

	public static class Woman {
		private String name;
		private int age;
		private String address;

		public Woman(String name, int age, String address) {
			this.name = name;
			this.age = age;
			this.address = address;
		}
	}
}
