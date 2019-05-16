/*
 *Write a program WindChill.java that takes two double commandline
arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab.
Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour),
the National Weather Service defines the effective temperature (the wind chill) to
be: 
 */
package org.bl.app;

import java.util.Scanner;

public class WindChill 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		double temp=Double.parseDouble(args[0]);
		double velocity=Double.parseDouble(args[1]);
		double value;
		if(temp<=50&&velocity>3&&velocity<=120) 
		{
		value=35.74+0.6215*temp+(0.4275*temp-35.75)*Math.pow(velocity, 0.16);
		System.out.println("windChill is:"+value);
	 }
		else
		{
			System.out.println("enter the proper values");
		}
	}
	

}
