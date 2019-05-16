package org.bl.app;

import java.util.Scanner;

public class Gambler 
{

	public static void main(String[] args) 
	{
 
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the stack value( Money you have):");
		int stack=sc.nextInt();
		System.out.println("enter the goal(money you want to gain):");
		int goal=sc.nextInt();
		System.out.println("numern times to play");
		int trails=sc.nextInt();
		
		int bets=0;
		int wins=0;
		for(int i=0;i<trails;i++)
		{
			int cash=stack;
			while(cash>0 &&cash<goal)
			{
				bets++;
				if(Math.random()<0.5)
					cash++;
				else
					cash--;
				
			}
			if(cash==goal)
			{
				wins++;
				
			}
		}
		System.out.println("wins="+wins);
		
		System.out.println("wins %="+wins/(float)trails*100);
		System.out.println("Average bets="+1.0*bets/trails);
	}

}
