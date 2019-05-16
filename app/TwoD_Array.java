package org.bl.app;

import java.util.Scanner;

public class TwoD_Array 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter size of array");
		int size = sc.nextInt();
		System.out.println("entre number of rows");
		int rows=sc.nextInt();
		System.out.println("enter number of columns");
		int columns=sc.nextInt();
		int[][] array=new int[rows][columns];
		System.out.println("enter the elements in array");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				int a=sc.nextInt();
				array[i][j]=a;
			}
		}
		System.out.println("Array Elements are:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
