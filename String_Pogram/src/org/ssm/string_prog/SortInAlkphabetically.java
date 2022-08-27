package org.ssm.string_prog;
import java.util.Scanner;
public class SortInAlkphabetically
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter thed string");
		String str=sc.nextLine();
		sc.close();
		String words[]=str.split(" ");
		for (int i = 0; i < words.length; i++) 
		{
			for (int j = i+1; j < words.length; j++) 
			{
				if(words[j].compareTo(words[i])<-1)
				{
					String t=words[i];
					words[i]=words[j];
					words[j]=t;
				}
			}
		}
		System.out.println("After the sorting"); 
		str=" ";
		for (int j = 0; j < words.length; j++) 
		{
			str=str+words[j]+" ";
		}
		System.out.println(str);
	}
}
