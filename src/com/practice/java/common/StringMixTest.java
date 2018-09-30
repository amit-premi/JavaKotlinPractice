package com.practice.java.common;

public class StringMixTest {
	
	//public static void main(String[] arg) {
	//One of the valid way to declare main() in Java
	public static synchronized strictfp void main(String... amit) {
	
		String str1 = "abc";
		String str2 = str1;
		str1 += "d";
		System.out.println(str1 +" "+ str2 +" "+ (str1 == str2));
		
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = sb1;
		sb1.append("def");
		System.out.println(sb1 +" "+ sb2 +" "+ (sb1 == sb2));
		
		
		String str3 = new String("Hello");
		str3.concat("World");
		System.out.println("Value of str: "+str3);
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("World");
		System.out.println("Value of StrBuffer: "+sb);
	}
}
