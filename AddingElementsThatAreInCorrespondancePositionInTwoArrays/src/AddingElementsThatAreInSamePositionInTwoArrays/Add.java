package AddingElementsThatAreInSamePositionInTwoArrays;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the lengths of 2D Array : ");
		int arr1[][]=new int[scan.nextInt()][scan.nextInt()];
		System.out.println("Enter the elements of an array 1 : ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1.length-1;j++)
			{
				arr1[i][j]=scan.nextInt();
			}
		}
		int arr2[][]=new int[arr1.length][arr1.length];
		System.out.println("Enter the elements of an array 2 : ");
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
				arr2[i][j]=scan.nextInt();
			}
			
		}
		int arr3[][]=new int[arr1.length][arr1.length];
		for(int i=0;i<=arr3.length-1;i++)
		{
			for(int j=0;j<=arr3.length-1;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];//Adding Logic of Correspondance Elements of Two Different Arrays 
			}
			
		}
		System.out.println("2D Arr1 elements are : ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1.length-1;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println("Elements of An 2D Array2 are : ");
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The resulted Array After Adding Correspondance Elements of Two Different Arrays : ");
		for(int i=0;i<=arr3.length-1;i++)
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
