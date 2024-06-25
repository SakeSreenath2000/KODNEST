package com.kodnest.CompositionExample.Programming;

public class BookApp {
	public static void main(String[] args) {
		Book bk=new Book("Kodnest");
		bk.readBook();
		bk.P.writeContent();
		bk=null;
		bk.readBook();/*This and below Statement gives an Error as "NULL POINTER EXPECTION"(means after saying bk=null 
						the object will destroyed so it shows null pointer mistake) because we have destroyed the Book 
						object by saying 'bk=null'*/
		bk.P.writeContent();
	}

}
