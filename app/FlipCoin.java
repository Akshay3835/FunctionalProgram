package org.bl.app;

import java.util.Scanner;

public class FlipCoin 
{

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of flips");
		double n=sc.nextDouble();
		int tails=0;
		int heads=0;
		for(int i=0;i<n;i++)
		{
			if(Math.random()<0.5)
				tails++;
			else
				heads++;
			
		}
		
		System.out.println("heads % is:"+(heads/n*100));
		System.out.println("tails % is"+(tails/n*100));
		System.out.println("tails count="+tails);
		System.out.println("heads count="+heads);
	}

}
 