package org.ssm.treeset;

import java.util.TreeSet;

public class ComparetoDemo 
{
public static void main(String[] args) 
{
	TreeSet ts=new TreeSet(new MyComprator());
	ts.add(10);
	ts.add(15);
	ts.add(100);
	ts.add(150);
	ts.add(1110);
	ts.add(105);
	
	
	System.out.println(ts);
}
}
