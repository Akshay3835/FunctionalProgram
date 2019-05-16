package util;

import java.util.Scanner;
import util.Utility;
public class BubbleSort_Int 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
			
		array=Utility.bubbleSort_Int(array);
		
		System.out.println("array elements after sorting");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
	}

}
