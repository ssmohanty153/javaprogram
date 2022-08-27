package org.ssm.set;

import java.util.HashSet;

public class Hashset 
{
public static void main(String[] args) 
{
	HashSet hs=new HashSet();
	hs.add(1);
	hs.add(2);
	hs.add(3);
	hs.add(4);
	hs.add(5);
	hs.add(2);
	System.out.println(hs.add(2));
	System.out.println(hs);
	
}
}
