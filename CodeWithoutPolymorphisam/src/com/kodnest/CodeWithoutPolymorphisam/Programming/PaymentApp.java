package com.kodnest.CodeWithoutPolymorphisam.Programming;

public class PaymentApp {
	public static void main(String[] args) {
		UPI upi=new UPI();
		upi.bill();
		upi.offer();
		upi.pay();
		Wallet wlt=new Wallet();
		wlt.bill();
		wlt.offer();
		wlt.pay();
		Card crd=new Card();
		crd.bill();
		crd.offer();
		crd.pay();
		
	}
	
}
