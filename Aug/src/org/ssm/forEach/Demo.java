package org.ssm.forEach;

public class Demo 
{
	public static void main(String[] args) 
	{
		
		for (int i = 1; i <= 4; i++)
		{
			for (int i1 = 1; i1 <= 4-i; i1++)
			{
				System.out.print(" ");
			}
			for (int i1 = 1; i1 <=i; i1++)
			{
				System.out.print(i1);
				
			}
			System.out.println();


			
		}

	}
}


