package org.bl.app;

import java.util.Scanner;


public class CircularList 
{

	public static void main(String[] args) 
	{
		Node head=null;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter you option\n1:insert\n2:delete\n3:display\n4:insert_front\n5:delete_front\n6:exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:head=insert_end(head);
			break;
			case 2:head=delete_end(head);
			break;
			case 3:display(head);
			break;
			case 4:head=insert_front(head);
			break;
			case 5:head=delete_front(head);
			break;
			case 6:System.exit(1);
			}
			
		}
	}
	public static Node insert_end(Node head)
	{
		Node node=new Node();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element tpo insert");
		int data=sc.nextInt();
		node.data=data;
		node.next=head;
		if(head==null)
		{
			node.next=node;
			head=node;
			
		}
		
		else
		{
			Node current=head;
			while(current.next!=head)
			{
				current=current.next;
			}
			current.next=node;
			
		}
		return head;
	
		
	}
	public static Node delete_end(Node head)
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return head;
		}
		if(head.next==head)
		{
			System.out.println("deleted element is"+head.data);
			head=null;
			return head;
		}
		else
		{
			Node current=head;
			Node prev=head;
			while(current.next!=head)
			{
				prev=current;
				current=current.next;
			}
			System.out.println("deleted element:"+current.data);
			prev.next=head;
		}
		return head;
		
	}
	public static void display(Node head)
	{
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			Node current=head;
		System.out.println("Elements in List");
		
		while(current.next!=head)
		{
			System.out.println(current.data);
			current=current.next;
			
		}
		System.out.println(current.data);
		}
		
		
	}
	public static Node insert_front(Node head)
	{
		Node node=new Node();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value to insert");
		int data=sc.nextInt();
		node.data=data;
		if(head==null)
		{
			head=node;
			node.next=node;
			return head;
		}
		else 
		{
			Node current=head;
			while(current.next!=head)
			{
				current=current.next;
			}
			current.next=node;
			node.next=head;
			head=node;
			return head;
		}
		
	}
	public static Node delete_front(Node head)
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return head;
		}
		System.out.println("deleted element is ="+head.data);
		head=head.next;
		return head;
	}

}
