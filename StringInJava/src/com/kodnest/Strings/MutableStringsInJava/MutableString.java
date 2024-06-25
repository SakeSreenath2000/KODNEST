package com.kodnest.Strings.MutableStringsInJava;

public class MutableString {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Rama");
		System.out.println(sb);
		sb.append("Sita");
		System.out.println(sb);
		System.out.println("==========================");
		StringBuilder sb1=new StringBuilder("Kodnest");
		System.out.println(sb1);
		sb1.append("Technologies");
		System.out.println(sb1);

	}

}
