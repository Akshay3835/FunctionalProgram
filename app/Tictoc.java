 package org.bl.app;

import java.util.Random;
import java.util.Scanner;

public class Tictoc {
	static char[][] matrix=new char[3][3];

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("X->indicates computer\nO->indicates candites");
		System.out.println("*->indicates empty places");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrix[i][j]='*';
			}
		}
		display();
	 candidates();
	 
		
	}
	/* candidate method to insert his row and column value*/
	public static void candidates()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("its your turn enter indices to insert");
		System.out.println(" 0,1,2 are indices");
		int row=sc.nextInt();
		int column=sc.nextInt();
		//row and column shoudn't be more than 3 because indicies lies between 0 to 2
		if(row<3&&column<3)
		{
			//check inserted values position value should be empty
		if(matrix[row][column]=='*')
		{
			matrix[row][column]='O';
		}
		else
		{
			System.out.println("enter proper indicies values");
			candidates();
		}
		}
		else
		{
			System.out.println("enter proper indicies values");
			candidates();
		}
			
		display();
		
		row_check(row,column);
		column_check(row,column);
		check_diagonal();
		check_diagonal_1();
		is_matrix_full();
		computer();
		
	
	}
	
	public static void computer()
	{
		
		
		Random r1=new Random();
		int row =r1.nextInt(3);
		int column=r1.nextInt(3);
		if(matrix[row][column]=='*') 
		{
		matrix[row][column]='X';
		}
		else 
		{
			computer();
		}
		display();
		
		row_check(row,column);
		column_check(row,column);
		check_diagonal();
		check_diagonal_1();
		is_matrix_full();
		candidates();
	}
	
	public static void display()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println("===================================");
	}
	public static void row_check(int row,int column)
	{
	if(matrix[row][0]==matrix[row][1]&&matrix[row][0]==matrix[row][2]&&matrix[row][0]!='*'&&matrix[row][1]!='*'&&matrix[row][2]!='*')
	{
		System.out.println("game over "+matrix[row][0]+" wins the game");
		
		System.exit(0);
	}
	}
	public static void column_check(int row,int column)
	{
		if(matrix[0][column]==matrix[1][column] &&matrix[0][column]==matrix[2][column]&&matrix[0][column]!='*'&&matrix[1][column]!='*'&&matrix[2][column]!='*')
		{
			System.out.println("game over "+matrix[0][column]+" wins the game");
			
			System.exit(1);
		}
	}
	public static void check_diagonal()
	{
		if(matrix[0][0]==matrix[1][1]&&matrix[0][0]==matrix[2][2]&&matrix[0][0]!='*'&&matrix[1][1]!='*'&&matrix[2][2]!='*')
		{
			System.out.println("game over "+matrix[0][0]+" wins the game");
			
			System.exit(1);
		}
	}
	public static void check_diagonal_1()
	{
		if(matrix[0][2]==matrix[1][1]&&matrix[0][2]==matrix[2][0]&&matrix[0][2]!='*'&&matrix[1][1]!='*'&&matrix[2][0]!='*')
		{
			System.out.println("game over "+matrix[0][2]+" wins the game");
		
			System.exit(1);
		}
	}

	public static void is_matrix_full()
	{
		int flag=1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(matrix[i][j]=='*') 
				{
					flag=0;
					return;
				}
			}
		}
		if(flag==1)
		{
			System.err.println("match tie");
			System.exit(1);
		}
	}
}
