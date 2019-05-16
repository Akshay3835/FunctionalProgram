package org.bl.app;

import java.util.Scanner;

public class Quadratic 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the co-efficients");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		double delta =Math.sqrt(b*b-4*a*c);
		double root1=(-b+delta/(2*a));
		double root2=(-b-delta/(2*a));
		
		System.out.println("root1="+root1);
		System.out.println("root2="+root2);

		
	}
}
