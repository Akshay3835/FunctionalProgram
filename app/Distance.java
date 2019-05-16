package org.bl.app;

import java.util.Scanner;

public class Distance 
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the co-ordinates");
		System.out.println("enter X-co-ordinate");
		int x=sc.nextInt();
		System.out.println("enter y co-ordinate");
		int y=sc.nextInt();
		double distance=Math.sqrt((x*x+y*y));
		System.out.println("distance is="+distance);
				
				
		
	}

}
