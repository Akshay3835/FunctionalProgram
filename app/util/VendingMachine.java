package util;

import java.util.Scanner;
import util.*;
public class VendingMachine 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the amount");
		int amount=sc.nextInt();
		int length=Utility.vchange.length-1;
		Utility.vandingMachine(amount,length);
	}
}
