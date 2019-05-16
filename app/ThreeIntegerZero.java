package org.bl.app;

import java.util.Scanner;

public class ThreeIntegerZero
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("entr the Size of array");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				for(int k=j+1;k<size;k++)
				{
					if((array[i]+array[j]+array[k])==0)
					{
						System.out.println(array[i]+" "+array[j]+" "+array[k]);
						count++;
					}
				}
			}
		}
		System.out.println("time="+count);
	}

}
