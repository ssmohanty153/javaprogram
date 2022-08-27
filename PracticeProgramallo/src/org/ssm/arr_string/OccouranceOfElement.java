package org.ssm.arr_string;
import java.util.Scanner;
public class OccouranceOfElement 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Eneter the size of  the array");
		int size=sc.nextInt();
		int arr[]=new int[size];

		System.out.println(" ENTER THE "+ size+" number");
		for (int i = 0; i < args.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		




		sc.close();	
	}

}
