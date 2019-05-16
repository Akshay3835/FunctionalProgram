package org.bl.app;

public class Parenthases 
{
	static char[] stack=new char[100];
	static int top=-1;
		public static void main(String[] args) 
		{
		
			String s1="[] {})";
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)=='(' && s1.charAt(i)=='{'&& s1.charAt(i)=='[')
					push(s1.charAt(i));
				display();
				if(top!=-1) {
				if(s1.charAt(i)==stack[top])
					pop();
				}
				
			}
			
			if(top==-1)
				System.out.println("balanced");
			else
				System.out.println("not balanced");
		
			
		}
		
		static void push(char ch)
		{
			stack[top++]=ch;
		}
		static void pop()
		{
			top--;
		}
		static void display()
		{
			for(int i=0;i<top;i++)
			{
				System.out.println(stack[i]);
			}
		}
	
}
