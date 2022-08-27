package org.ssm.string_prog;
import java.util.Scanner;
public class OcceranceOfEachCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		sc.close();

		int count[]=new int[128];
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			count[ch]++;
		}


		for (int i = 0; i < count.length; i++) 
		{
			if(count[i]>=1)	
			{
				System.out.println((char)i+"-->"+count[i]);
			}

		}

	}
}
