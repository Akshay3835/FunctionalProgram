package util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import util.*;
public class BinarySearch_String 
{

	public static void main(String[] args) 
	{
		Scanner cs=new Scanner(System.in);
		System.out.println("enter the string");
		String string1=cs.nextLine();
		String array[]=string1.split(" ");
		Arrays.sort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("enter the key to search");
		String key=cs.nextLine();
		int location=Utility.binarySearch(0,array.length-1,array,key);
		if(location==-1)
			System.out.println("key not found");
		else
			System.out.println("key found in location="+location);
	}

}
