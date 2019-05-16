package org.bl.app;

import java.util.Scanner;

public class Time 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 0 to start");
		int star=sc.nextInt();
		long start=System.currentTimeMillis();
		System.out.println("enter  any key stop");
		String stp=sc.next();
		long stop=System.currentTimeMillis();
		System.out.println(start);
		System.out.println(stop);
		
		long elipse=stop-start;
		System.out.println(elipse);
		
	}

}
