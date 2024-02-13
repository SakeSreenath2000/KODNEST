package com.kodnest.WithoutUsingDaemonThread.Programming;

public class EclipseApp {
	public static void main(String[] args) {
		Typing type=new Typing();
		Compilation comp=new Compilation();
		Saving sav=new Saving();
		type.start();
		comp.start();
		sav.start();
	}

}
