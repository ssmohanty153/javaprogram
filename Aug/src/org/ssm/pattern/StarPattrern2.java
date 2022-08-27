package org.ssm.pattern;
import java.util.Scanner;
public class StarPattrern2 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the  odd number number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sp=n/2,st=1;
		sc.close();
		for (int i = 1; i <=n; i++) 
		{
			for (int j = 1; j <=sp; j++) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <=st; j++) 
			{
				if(j==1||j==st)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			if(i<=n/2)
			{
				st=st+2;
				sp--;
			}
			else
			{
				st=st-2;
				sp++;
			}
			System.out.println();
		}
	}
}