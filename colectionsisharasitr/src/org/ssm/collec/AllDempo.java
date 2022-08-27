package org.ssm.collec;

import java.util.ArrayList;

public class AllDempo 
{
public static void main(String[] args)
{
	ArrayList<String>ar=new ArrayList<String>();
	ar.add("ajit");
	ar.add("kesab");
	ar.add("hari");
	ar.add("kkr");
	ar.add("rb");
	ar.add(null);
	ar.add("mi");
	ar.add("rb");
	for (int i = 0; i < ar.size(); i++) 
	{
		String  s=ar.get(i);
		System.out.println(s);
	}
	System.out.println("-----------------------");
	for(String s:ar)
	{
		System.out.println(s);
	}
}


}

