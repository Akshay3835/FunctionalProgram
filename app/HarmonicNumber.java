package org.bl.app;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the harmonic numner");
		int n=sc.nextInt();
		double harmonic=0;
		if(n>0) 
		{
		for(int i=1;i<=n;i++)
		{
			harmonic=harmonic+1/(float)i;
		}
		System.out.println(n+"th harmonic value is="+harmonic);
		}
		else if(n<0)
		{
			for(int i=-1;i>n;i--)
			{
				harmonic=harmonic+1/(float)i;
			}
			System.out.println(n+"th harmonic value is="+harmonic);
		}
		else 
			System.err.println("cannot divide by Zero");
		
	}

}
