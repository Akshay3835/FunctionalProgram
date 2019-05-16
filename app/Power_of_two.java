package org.bl.app;

import java.util.Scanner;

public class Power_of_two 
{ 

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the power value");
		int n=sc.nextInt();
		if(n>=32)
			System.out.println("enter the value less than 32");

		else 
		{
			System.out.println("power of 2 values");
			for(int i=0;i<=n;i++)
			{
				System.out.println((int)Math.pow(2, i));
			}
		}
	}
}
