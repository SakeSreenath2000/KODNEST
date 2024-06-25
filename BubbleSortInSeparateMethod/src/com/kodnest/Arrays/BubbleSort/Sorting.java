package com.kodnest.Arrays.BubbleSort;

public class Sorting {
	public void SortApp(int arr[]) {
		//Performing BubbleSort
				int n=arr.length;
				for(int i=0;i<=n-2;i++)
				{
					for(int j=0;j<=n-2-i;j++)
					{
						if(arr[j]>arr[j+1])//for BubbleSortAscending
						//if(arr[j]<arr[j+1])//for BubbleSortDescending
						{
							//Swapping Condition
							 int swap= arr[j];
							 arr[j]=arr[j+1];
							 arr[j+1]=swap;
						}
					}
				}
		
	}

}
