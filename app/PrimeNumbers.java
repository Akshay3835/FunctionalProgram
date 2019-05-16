package org.bl.app;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class PrimeNumbers 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Strating range");
		int start=sc.nextInt();
		System.out.println("enter ending range");
		int end=sc.nextInt();
		System.out.println("Prime Numbers are");
		for(int i=start;i<=end;i++)
		{
			int count=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
		
	}

}
