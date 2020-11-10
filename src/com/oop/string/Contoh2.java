package com.oop.string;

// https://www.tutorialspoint.com/java/java_strings.htm
public class Contoh2 {
	// length String
	void stringLength() {
		String string1 = "S1 Informatika UNS";
		int len = string1.length();
		System.out.println("Panjang string : " + len);
	}

	// menyambung string
	void concatStrings() {
		String string1 = "kita belajar ";
		System.out.println("Mari " + string1 + "pemrograman Java");
		
		String string2 = "yuk";
		System.out.println(string1.concat(string2));
	}
	
	// format string
	void formatString() {
		float f1 = 0.1f;
		int i1 = 78;
		String s1 = "oke";
		System.out.printf("The value of the float variable is " +
                "%f, while the value of the integer " +
                "variable is %d, and the string " +
                "is %s", f1, i1, s1);
		
	}

	public static void main(String[] args) {
		Contoh2 c2 = new Contoh2();
		c2.stringLength();
		c2.concatStrings();
		c2.formatString();
	}
}
