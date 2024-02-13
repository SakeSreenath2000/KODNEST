package com.kodnest.CompositionExample.Programming;

public class Book {
	String author;
	Page P=new Page("Java");
	Book(String author)
	{
		this.author=author;
	}
	void readBook()
	{
		System.out.println("Reading Book by author "+author);
	}

}
