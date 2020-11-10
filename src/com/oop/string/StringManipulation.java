package com.oop.string;

public class StringManipulation {
	// uppercase dan lowercase
	void changeCase() {
		String string1 = "s1 informatika uns";
		String string2 = "UNIVERSITAS SEBELAS MARET";
		// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#toUpperCase()
		System.out.println(string1.toUpperCase());
		// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#toLowerCase()
		System.out.println(string2.toLowerCase());
	}
	
	void replaceString() {
		String string1 = "UNIVERSITAS SEBELAS MARET";
		// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#replace(java.lang.CharSequence,%20java.lang.CharSequence)
		System.out.println(string1.replace("SEBELAS", "dua belas"));
	}
	
	public static void main(String[] args) {
		StringManipulation sm = new StringManipulation();
		sm.changeCase();
		sm.replaceString();
	}
}
