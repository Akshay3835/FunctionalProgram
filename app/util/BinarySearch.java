package util;

import java.util.Scanner;

import util.*;
public class BinarySearch 
{

	public static void main(String[] args) 
	{
		int location=-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] array=new int[size];
		int low=0;
		int high=size-1;
		
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++)
		{
		array[i]=sc.nextInt();
		}
		
		System.out.println("enter the key to search");
		int key=sc.nextInt();
		location=Utility.binarySearch(array, key);
		
		if(location==-1)
		{
			System.out.println("key not found in the array");
		}
		else
			System.out.println("key found in the location="+location);
		location=Utility.binarySearch(0, high, array, key);
		if(location==-1)
		{
			System.out.println("key not found in the array");
		}
		else
			System.out.println("key found in the location="+location);
	}

}
