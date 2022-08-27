package com.string.first;
import java.util.Scanner;
public class SumOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter thew string :");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		int sum=0;
		for (int i = 0; i < ch.length; i++) 
		{
			int no=0;
			while(i<ch.length&&ch[i]>='0'&&ch[i]<='9')
			{
				no=no*10+ch[i]-48;
				i++;
						
			}
			sum=sum+no;
		
		}
		System.out.println("sum of number :"+sum);
	}

}
