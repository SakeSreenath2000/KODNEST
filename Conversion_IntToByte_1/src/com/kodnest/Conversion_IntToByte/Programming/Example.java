package com.kodnest.Conversion_IntToByte.Programming;

public class Example {
	public static void main(String[] args) {
		//byte Y=200; This will cause a compilation error because 200 is out of valid range of byte
		/*If we try to assign the value outside the valid range of byte or short , we will
		 encounter a error unless you explicitly perform a cast to inform the compiler that
		you are aware of the source data will be lost*/
		//byte ranges from -128 to +127
		//To fix above error we need to explicitly cast the value to "byte"
		
		byte Y=(byte)200;//Explicitly cast 200 to byte
		System.out.println("Y = "+Y);
	}
}
