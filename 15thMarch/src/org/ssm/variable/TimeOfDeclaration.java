package org.ssm.variable;

public class TimeOfDeclaration 
{
	public static void main(String[] args) 
	{
		String name;
		{
			name="raju";
			System.out.println(name);
		}
	}
}
/*

String name="raju";
{

	System.out.println(name);
}
 */