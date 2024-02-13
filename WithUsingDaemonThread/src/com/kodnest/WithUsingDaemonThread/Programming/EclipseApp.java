package com.kodnest.WithUsingDaemonThread.Programming;

public class EclipseApp {
	public static void main(String[] args) {
		Typing type=new Typing();
		Compilation comp=new Compilation();
		Saving sav=new Saving();
		
		//Following Step:-2 The Daemon Thread status should be set as True
		comp.setDaemon(true);
		sav.setDaemon(true);
		
		type.start();
		comp.start();
		sav.start();
	}

}
