package com.oop.string;

public class StringCompare {
	// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#compareTo(java.lang.String)
	void testCompareTo() {
		String s1 = "string 1";
		String s2 = "string 2";
		System.out.println(s1+" compareTo "+s1+" : "+s1.compareTo(s1));
		System.out.println(s1+" compareTo "+s2+" : "+s1.compareTo(s2));
	}
	
	void testEquals() {
		String s1 = "string 1";
		String s2 = "string 2";
		String s3 = "String 1";
		// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#equals(java.lang.Object)
		System.out.println(s1+" equals "+s1+" : "+s1.equals(s1));
		System.out.println(s1+" equals "+s2+" : "+s1.equals(s2));
		System.out.println(s1+" equals "+s3+" : "+s1.equals(s3));
		// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#equalsIgnoreCase(java.lang.String)
		System.out.println(s1+" equalsIgnoreCase "+s3+" : "+s1.equalsIgnoreCase(s3));
	}
	
	void testContains() {
		String s1 = "ini adalah contoh string";
		String s2 = "\"string 2\" adalah sebuah contoh string";
		// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#contains(java.lang.CharSequence)
		System.out.println("\" "+s1+"\" "+" contains \"sebuah\" ? "+s1.contains("sebuah"));
		System.out.println(s2+" contains \"sebuah\" ? "+s2.contains("sebuah"));
	}
	
	public static void main(String[] args) {
		StringCompare sc = new StringCompare();
		sc.testCompareTo();
		sc.testEquals();
		sc.testContains();
	}
}
