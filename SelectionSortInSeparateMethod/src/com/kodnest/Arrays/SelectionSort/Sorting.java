package com.kodnest.Arrays.SelectionSort;

public class Sorting {
	public void SortApp(int arr[]) {
		//Selection Sort Logic
		int n=arr.length;
		for(int i=0;i<=n-2;i++)
		{
			int min = arr[i];
			int pos = i;
			for(int j=i+1;j<=n-1;j++)
			{
				if(arr[j]<min)//for SelectionSortAscending
				//if(arr[j]>min)//for SelectionSortDescending
				{
					min=arr[j];
					pos=j;
				}
				
			}
			//swapping arr[i] and arr[j]
			int help = arr[i];
			arr[i]=arr[pos];
			arr[pos]=help;
			
		}		
		
	}

}
