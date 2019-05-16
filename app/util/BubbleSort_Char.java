package util;

import java.util.Scanner;
import util.*;
public class BubbleSort_Char 
{ 

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		char a=sc.next().charAt(0);
		System.out.println(a);
		System.out.println(" enter the characters");
		String s=sc.next();
		char[] array=s.toCharArray();
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		array= Utility.bubbleSort_Char(array);
		System.out.println("after sorting");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}

}
