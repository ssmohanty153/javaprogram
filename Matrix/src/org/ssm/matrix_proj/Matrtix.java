package org.ssm.matrix_proj;

import java.util.Scanner;
public class Matrtix 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the row and column");

		int column=sc.nextInt();
		int rows=sc.nextInt();
		int mul=(column*rows);

		String arr[][]=new String [column][rows];
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				arr[i][j]=sc.next();

			}
		}
		System.out.println("------------------");
		int k=0;
		String arr2[]=new String[mul];
		for (int i = 0; i < arr.length; i++) 
		{
			
			for (int j = 0; j < arr[i].length; j++) 
			{
				//System.out.print(arr[i][j]);
				//System.out.print(arr[i][j].length());
				//System.out.println("@@@");

				if(arr[i][j].length()%2==0)
				{
					arr2[k]=arr[i][j];
					k++;
				}
				else
				{
					mul--;
				}
				System.out.println(" ");


			}

			

		}
		int count=0;
		for (int k1 = 0; k1 <arr2.length; k1++) 
		{
			
			if(arr2[k1]!=null) 
			{
				System.out.println(arr2[k1]);
				count++;
			}


			//System.out.println(" , ");

		}
		String arr3[]=new String[count];
		
		
		//System.out.println(arr2.length);

	}

}
