package org.bl.app;

import java.util.Scanner;

public class Permutation 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String string=sc.next();
		int length=string.length();
		long itvalue=itterativ(length);
		System.out.println("itterative value="+itvalue);
		long rcvalue=recursion(length);
		System.out.println("recursion value="+rcvalue);
		if(itvalue==rcvalue)
		{
			System.out.println("both values are same");
		}
		else
			System.out.println("both are not same");
	}
	
	public static long itterativ(int length)
	{
		long mul=1;
		for(int i=1;i<=length;i++)
		{
			mul=mul*i;
		}
		return mul;
	}
	
	public static long recursion(int length)
	{
		if(length==0)
		{
			return 1;
			
		}
		else if(length==1)
		{
			return 1;
		}
		else
		{
			return length*recursion(length-1);
		}
	}

}
