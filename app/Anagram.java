package org.bl.app;

import java.nio.channels.ServerSocketChannel;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
		public static void main(String[] args) 
		{
	
			Scanner sc= new Scanner(System.in);
			System.out.println("enter String 1");
			String string1=sc.next();
			System.out.println("enter String 2");
			String string2=sc.next();
			char[] array1=new char[string1.length()];
			char[] array2=new char[string2.length()];
			Arrays.sort(array1);
			Arrays.sort(array2);
			if(array1.equals(array2))
			{
				System.out.println("anagrams");
			}
			else
			{
				System.out.println("not an anagrams");
			}
			
		}
	
}
