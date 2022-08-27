//I am good  boy.but Hari is VeryGpood boy.
//I ma doog  tub.yob iraH si doopGyreV .yob

package org.ssm.string_prog;
import java.util.Scanner;
public class ReverseTheWord
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		sc.close();
		String sr=returnLength(str);
		System.out.println(sr);
	}
	static String returnLength(String str) 
	{
		char ch[]=str.toCharArray();
		str="";
		for (int i = 0; i < ch.length; i++) 
		{
			int k=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while(j>=k)
			{
				str=str+ch[j];
				j--;
			}
			if(i<ch.length)
			{
				str=str+ch[i];
			}
		}
		return str;
	}
}
