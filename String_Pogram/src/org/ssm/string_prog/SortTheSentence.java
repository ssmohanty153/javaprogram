package org.ssm.string_prog;

import java.util.Scanner;

public class SortTheSentence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		sc.close();
		String words[]=str.split(" ");
		for (int i = 0; i < words.length; i++) 
		{
			for (int j = i+1; j < words.length; j++) 
			{
				//if(words[j].length()<words[i].length())
				if(words[j].compareTo(words[i])<-1)
				{
					String t=words[i];
					words[i]=words[j];
					words[j]=t;
				}

			}

		}
		System.out.println(" After the sort");
		str="";
		for (int i = 0; i < words.length; i++) 
		{
			str=str+words[i]+" ";

		}
		System.out.println(str);
	}
}
