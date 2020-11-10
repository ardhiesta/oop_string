package com.oop.string;

// https://www.javatpoint.com/java-string
public class Contoh1 {
	public static void main(String[] args) {
		// contoh deklarasi variabel tipe String
		// String lateral
		String string1 = "welcome";
		// print ke layar
		System.out.println(string1);

		// new keyword
		String string2 = new String("Welcome");
		// print ke layar
		System.out.println(string2);

		// char array
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		System.out.println(ch);
		String string3 = new String(ch);// converting char array to string
		System.out.println(string3);
	}
}
