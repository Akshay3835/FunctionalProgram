package org.bl.app;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		String S1 ="Hello AkshayKumar ! Welcome to Bridgelabz";
		String arr[] = S1.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			reverse(arr[i]);
		}
		
		
	}

	public static void reverse(String str) 
	{
		char a[]= str.toCharArray();
		System.out.print(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
	}

}
