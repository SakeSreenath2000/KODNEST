package com.kodnest.RaisedToPowerOfN.Programming;

public class Power {
	int raiseToPowerN(int num,int n)
	{
		int finalresult=1;
		for(int i=1;i<=n;i++)
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


}
