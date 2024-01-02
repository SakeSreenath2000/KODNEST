package com.kodnest.RaisedToThePowerOfNumberOfDigitsInTheNumber;

public class DigitsCount {
	int Counting(int num)
	{
		int count=0;
		while(num!=0)//As long As number of digits present in number not equals to zero(0) the loop will execute
		{
			num=num/10;/*As long As number of digits present in number will become 
											zero every take out the lastdigit and do count++ */
			count++;
		}
		return count;/*if number of digits present in number will become zero then come out 
								the loop and return count which gives how many digits present in the given number */
	}

}
