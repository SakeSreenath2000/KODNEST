package com.kodnest.Arrays.BinarySearchUsingBubbleSortAlgorithm;

public class SearchApp {
	public static int binarySearch(int arr[],int Key) {
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(Key==arr[mid])
			{
				return mid;
			}
			else if(Key>arr[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return -1;
		
	}

}
