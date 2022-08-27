package com.ssm.NumberPattern;
public class Number12 {
	public static void main(String[] args) {
		String st="jspiders";
		int n=(st.length()/2)+1;
		System.out.println("enter the number");
		for(int i=1;i<=st.length();i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++)
			{
				if(j==st.length())
					return;
				System.out.print(st.charAt(j)+"");
			}
			System.out.println();
		}
	}
}
