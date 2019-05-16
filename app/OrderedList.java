package org.bl.app;

import java.util.Scanner;

public class OrderedList 
{
	public static void main(String[] args) 
	{
		Node head=null;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			
		
			System.out.println("enter your option\n1:insert\n2:display\n3:exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				head=insert_end(head);
			break;
			case 2:display(head);
			break;
			case 3:System.exit(0);
			}
		}
	}
	public static Node insert_end(Node head)
	{
		
		Scanner sc1=new Scanner(System.in);
		Node node=new Node();
		
		System.out.println("enter the value to insert");
		int data=sc1.nextInt();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node current=head;
			while(current.next != null && current.next.data < node.data)
			{
				current=current.next;
			}
			node.next=current.next;
			current.next=node;
		}
		return head;
	}
	public static void display(Node head)
	{
		
		Node current=head;
		if(current==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			System.out.println("Elements in linked list");
			while(current.next!=null)
			{
				System.out.println(current.data);
				current=current.next;
			}
			System.out.println(current.data);
		}
	}
}

