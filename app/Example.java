package org.bl.app;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Node head=null;
	}

	public static Node pop(Node head)

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
	public static Node push(Node head)
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
}
