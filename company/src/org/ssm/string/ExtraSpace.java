package org.ssm.string;

public class ExtraSpace 
{
	public static void main(String[] args) 
	{
		String str="babgvhjscguy  bhjsghahhhh   hh  hh ";
		//str=str.trim().replaceAll("[]{2,}", " ");
		System.out.println(str.replaceAll("( )+", " ").trim());
		
	}

}
