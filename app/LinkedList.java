package org.bl.app;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

class Node
{
	int data;
	Node next;
	
	
}
public class LinkedList 
{
	public static void main(String[] args) 
	{
		Node head=null;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter your choice\n1:insert_end\n2:delete_end\n3:insert_front\n4:delete_front\n5:insert_position"
					+"\n6:delete_position\n7:display\n8:search\n9:delete element\n10:exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				head=insert_end(head);
			break;
			case 2:head=delete_end(head);
			break;
			case 3:head=insert_front(head);
			break;
			case 4:head=delete_front(head);
			break;
			case 5:head=insert_position(head);
			break;
			case 6:head= delete_position(head);
			break;
			case 7:display(head);
			break;
			case 8:search(head);
			break;
			case 9:head=delete_element(head);
			break;
			case 10: System.exit(1);
			break;
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
			while(current.next!=null)
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
			System.out.println("List is Empty");
			return head;
		}
		if(head.next==null)
		{
			System.out.println("deleted element is="+head.data);
			head=null;
			return head;
		}
		else
		{
			Node current=head;
			Node prev=current;
			while(current.next!=null)
			{
				prev=current;
				current=current.next;
			}
			System.out.println("deleted element is="+current.data);
			prev.next=null;
			return head;
			
		}
		
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
	
	public static Node insert_front(Node head)
	{
		Node node=new Node();
		Scanner Sc2=new Scanner(System.in);
		System.out.println("enter value to insert");
		int data=Sc2.nextInt();
		node.data=data;
		node.next=null;
		if(head==null)
			return node;
		else
		{
			node.next=head;
			head=node;
			return head;
		}
		
		
		
	}
	public static Node delete_front(Node head)

	{
		if(head==null)
		{
			System.out.println("List is empty");
			return head;
		}
		if(head.next==null)
		{
			System.out.println(head.data);
			head=null;
			return head;
		}
		else
		{
			System.out.println(head.data);
			head=head.next;
			return head;
		}
	}
	public static Node insert_position(Node head)
	{
		Scanner sc1=new Scanner(System.in);
		Node node=new Node();
		if(head==null)
		{
			System.out.println("it's a first node you can't insert in between");
			int data=sc1.nextInt();
			System.out.println("enter the value to insert");
			node.data=data;
			node.next=null;
			return node;
		}
		else
		{
			System.out.println("enter the position to insert");
			int position=sc1.nextInt();

			Node current=head;
			Node prev=current;
			for(int i=1;i<position;i++)
			{
				prev=current;
				current=current.next;
			}
			prev.next=node;
			node.next=current;
			return head;
		}
	}
	public static Node delete_position(Node head)
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return head;
		}
		if(head.next==null)
		{
			System.out.println("only one element is present in list deleting that");
			System.out.println(head.data);
			head=null;
			return head;
		}
		else
		{
			Node current=head;
			Node prev=current;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the position to delete");
			int position=sc.nextInt();
			for(int i=1;i<=position;i++)
			{
				prev=current;
				current=current.next;
			}
			System.out.println("deleted elemente="+current.data);
			prev.next=current.next;
			return head;
		}
	}
	public static void search(Node head)
	{
		Scanner sc=new Scanner(System.in);
		Node current=head;
		int count=0;
		System.out.println("enter the search key");
		int key=sc.nextInt();
		while(current.data!=key)
		{
			current=current.next;
			count++;
			
		}
		if(current.data==key)
		{
			System.out.println("Key found in  position="+(++count));
			return;
		}
		else
		{
			if(current.next==null)
			{
				System.out.println("key not found in Linked List");
				return;
			}
		}
	}
	
	public static Node delete_element(Node head)
	{
		Node current=head;
		if(current==null)
		{
			System.out.println("List is Empty");
			return head;
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element to delete");
		int ele=sc.nextInt();
		Node prev=current;
		while(current.data!=ele)
		{
			prev=current;
			current=current.next;
		}
		if(current.data==ele)
		{
			System.out.println("deleted elemented is"+current.data );
			prev.next=current.next;
			return head;
		}
		else
		{
			System.out.println("Element is not found in List");
			return head;
		}
	}
	}
