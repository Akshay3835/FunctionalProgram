package org.bl.app;

import java.util.Scanner;

public class LeapYear 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year,year1,count=0;
	
		year=sc.nextInt();
		 year1=year;
		count=0;
		while(year1!=0)
		{
			count++;
			year1=year1/10;
		}
		if(count==4)
		{
			boolean flag=false;
			if(year%400==0)
				flag=true;
			else if(year%100==0)
				flag=false;
			else if(year%4==0)
				flag=true;
			else
				flag=false;
			
			
			if(flag)
			{
				System.out.println(year+" is leap year");
			}
			else
				System.out.println(year+" is not leap year");
		}
		else
		{
			System.out.println("enter proper year");
		
		}
		
	}

}
