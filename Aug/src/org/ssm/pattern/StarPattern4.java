package org.ssm.pattern;

public class StarPattern4 
{
	public static void main(String[] args) 
	{
		int n=5,k=1;
		for (int i = 1; i <=n; i++) 
		{
			for (int j = 1; j <=n-i; j++) 
			{
				System.out.print(" ");
				
				
			}
			
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(k);
				k++;
				if(k>9)
				{   
					k=1;
					
				}
				
			}
			
			System.out.println();
		
		}
		
		

	}
}
