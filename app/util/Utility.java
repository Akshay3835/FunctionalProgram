package util;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout;

public class Utility 
{
	// this array is used for vandingMachine Method
	static int vchange[]= {1,2,5,10,50,100,500,1000,2000};
	
	public static int[] bubbleSort_Int(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
	public static char[] bubbleSort_Char(char []array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					char temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		
		}
		return array;
}
	
	public static void vandingMachine(int amount, int length) 
	{
		
	if(amount==0)
	{
		System.out.println("change is 0");
		return;
		
	}
	else
	{
		
			System.out.println(vchange[length]+" Note is"+amount/vchange[length]);
			vandingMachine(amount%vchange[length],length-1);
		
	}
	}
	
	
	// itterative method to find the key in array
	public static int binarySearch(int[] array,int key)
	{
		int low=0;
		int high=array.length-1;
		int mid=0;
		int flag=-1;
		while(low<=high)
		{
			 mid=(low+high)/2;
			if(array[mid]==key)
			{
				flag=1;
				break;
			}
			else if(array[mid]>key)
				high=mid-1;
			else
				low=mid+1;
		}
		if(flag==1)
			return mid;
		else
			return -1;
	}
	
	//recursion method to find the key in integer array
	public static int binarySearch(int low,int high,int[] array,int key)
	{
		if(high>=low)
		{
			int mid=(low+high)/2;
			if(array[mid]==key)
				return mid;
			if(array[mid]>key)
				return binarySearch(low, mid-1, array, key);
			else
				return binarySearch(mid+1, high, array, key);
		}
	
	return -1;
	}
	
	//recursion method to find the key String array
public static int binarySearch(int low,int high,String[] array,String key)
{
	if(high>=low)
	{
		int mid=(low+high)/2;
	
		int flag=key.compareTo(array[mid]);
		if(flag==0)
			return mid;
		if(flag<0)
			return binarySearch(low, mid-1, array, key);
		else
			return binarySearch(mid+1, high, array, key);
	}
	return -1;
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

