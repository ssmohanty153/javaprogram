package org.ssm.string;

import java.util.Scanner;

public class StringIsPresent 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();

		sc.close();
		boolean st=reverseStri(str1,str2);
		if(st)
			System.out.println(str2);


	}

	static boolean reverseStri(String str1, String str2)



	{

		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		int i=0,j=0;
		while(i<ch1.length)
		{
			int k=i;
			while(k<ch1.length&&j<ch2.length&&ch1[k]==ch2[j])
			{
				k++;
				j++;
			}
			if(j==ch2.length)
			{
				return true;
			}


			i++;
		}



		return false;
	}


}
