package com.kodnest.CodeWithPolymorphisamUsingUpCasting.Programming;

public class PaymentApp {
	public static void main(String[] args) {
		Payment ref;
		UPI upi=new UPI();
		ref=upi;//Up Casting
		ref.bill();
		ref.offer();
		ref.pay();
		Wallet wlt=new Wallet();
		ref=wlt;//Up Casting
		ref.bill();
		ref.offer();
		ref.pay();
		Card crd=new Card();
		ref=crd;//Up Casting
		ref.bill();
		ref.offer();
		ref.pay();
		
	}
	

}
