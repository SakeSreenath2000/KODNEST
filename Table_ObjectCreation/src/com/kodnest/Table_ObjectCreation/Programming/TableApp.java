package com.kodnest.Table_ObjectCreation.Programming;

public class TableApp {
	public static void main(String[] args) {
		Table t1=new Table();
		t1.seatingCapacity=6;
		t1.cost=4500;
		t1.color="Brown";
		t1.brand="GreenPly";
		t1.allowToSit();
		t1.allowToWrite();
		System.out.println(t1.seatingCapacity+" "+t1.cost+" "+t1.color+" "+t1.brand);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Table t2=new Table();
		t2.seatingCapacity=4;
		t2.cost=3000;
		t2.color="white";
		t2.brand="XYZ";
		t2.allowToSit();
		t2.allowToWrite();
		System.out.println(t2.seatingCapacity+" "+t2.cost+" "+t2.color+" "+t2.brand);
	}

}
