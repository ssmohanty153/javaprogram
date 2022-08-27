package org.ssm.arrayElement;

import java.util.TreeSet;

public class TreeSSetObject
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new Mycomparater());
		t.add("x");
		t.add("y");
	
		t.add("p");
		t.add("q");
		t.add("z");
		t.add("a");
		System.out.println(t);
		
	}

}
