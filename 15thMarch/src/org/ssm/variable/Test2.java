package org.ssm.variable;

public class Test2 
{
	void testMeth(String s) 
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		Test2 t= new Test2();
		t.testMeth(null);
		t.testMeth("hare Krishna ram");
		String s="hare Krishna";
		t.testMeth(s);

	}

}
