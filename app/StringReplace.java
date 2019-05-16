package org.bl.app;

import java.util.Scanner;

public class StringReplace 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String orignal="Hello <<userName>>,How are you?";
		System.out.println("enter username");
		String name=sc.next();
		String Modified=orignal.replace("<<userName>>", name);
		System.out.println(orignal);
		System.out.println(Modified);
	}

}