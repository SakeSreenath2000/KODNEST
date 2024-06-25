package com.kodnest.Strings.MutableStringsInJava;

public class Capacity {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());//Output=16 because Initial Capacity of StringBuffer (or) StringBuilder is 16.
		sb.append("Omkar Is A BatsMan");/*If Capacity is filled to its full then new capacity would be generated which
		 																				is equal to "OldCapacity*2+2"*/
		System.out.println(sb.capacity());//Output=34
		sb.append("He Lives In Bangalore");
		System.out.println(sb.capacity());//Output=70
	}

}
