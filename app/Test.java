package org.bl.app;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) 
	{
	
		Random r1=new Random();
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of cupons");
		int cupons=sc.nextInt();
		for(int i=0;i<cupons;i++)
		{
			int temp=r1.nextInt(1000);
			
			if(!a1.contains(temp))
				a1.add(temp);
		}
		
		
		System.out.println("cupons are:");
		for(int k:a1)
		{
			System.out.println(k);
		}
		
	}
}
