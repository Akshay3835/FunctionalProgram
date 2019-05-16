package util;

import java.util.Scanner;

public class Hashing 
{
	static Node[] hash=new Node[100];
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many number u want to insert");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the numbers");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<size;i++)
		{
			int value=a[0]%size;
			hash=insert(value,a[0]);
		}
		display(hash);
			
	}
	public static Node[] insert(int index,int value)
	{
		Node node=new Node();
		node.data=value;
		node.next=null;
		if(hash[index]==null)
		{
			hash[index]=node;
			
			return hash;
		}
		else
		{
			Node current=hash[index];
			if(current.next==null)
			{
			
				current.next=node;
			}
			else
			{
				while(current.next!=null)
				{
					current=current.next;
				}
				current.next=node;
				return hash;
			}
			return hash;
		}
	
	}
	public static void display(Node[] hash)
	{
		
		for(int i=0;i<10;i++)
		{
			Node current=hash[0];
			if(current==null)
			{
				System.out.println("0");
				continue;
			}
			else
			{
				while(current.next!=null)
				{
					System.out.println(current.data);
					current=current.next;
				}
				System.out.println(current.data);
			}
		}
			
	}
}
