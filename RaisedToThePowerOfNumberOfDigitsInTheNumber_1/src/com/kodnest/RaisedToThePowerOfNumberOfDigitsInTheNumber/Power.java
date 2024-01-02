package com.kodnest.RaisedToThePowerOfNumberOfDigitsInTheNumber;

public class Power {
	//Logic for Generating value when given number is raised to Power of Number of Digits in the given Number
	int raiseToPowerOfNumberOfDigitsInTheNumber(int num,int digicount)
	{
		int finalresult=1;
		for(int i=1;i<=digicount;i++)
		{
			finalresult=finalresult*num; /*i.e if we take num=10 and n=2 as an example and we considered finalresult=1 
			because if we take finalresult=0 though it is multiplication process any number multiplied by zero is zero 
			so we took finalresult=1 , Now if condition satisfies in for loop then "finalresult*num=1*10" is done and
			stored back in finalresult(it will be 10) ,again it checks the condition if it satisfies in for loop then 
			"finalresult*num=10*10"(because 10 stored in finalresult) is done stored back in finalresult(it will be 100), 
			This Process will be repeated untill for loop condition fails when it fails it comes out of loop and returns 
			the result stored in finalresult */
		}
		return finalresult;
	}
	//Logic for counting Digits in a Given Number
	int Counting(int num)
	{
		int count=0;
		while(num!=0)//As long As number of digits present in number not equals to zero(0) the loop will execute
		{
			num=num/10;/*As long As number of digits present in number will become 
											zero every time take out the lastdigit and do count++ */
			count++;
		}
		return count;/*if number of digits present in number will become zero then come out 
								the loop and return count which gives how many digits present in the given number */
	}


}
