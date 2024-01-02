package com.kodnest.Arrays.InsertionSortProgramming;

public class SortingApp {
	public void InsertionSorting(int arr[]) {
		//Performing Insertion Sort
		int n=arr.length;
		for(int i=1;i<=n-1;i++)
		{
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item)//for insertionSort Ascending
			//while(j>=0 && arr[j]<item)//for insertionSort Descending
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
			
		}
		
	}

}
