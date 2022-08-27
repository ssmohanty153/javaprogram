package org.ssm.treeset;

import java.util.Comparator;

public class MyText implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		String s1=o1.toString();

		String s2=o2.toString();
//
//
//		return s1.compareTo(s2);
		
		
		
		int l1=s1.length();
		int l2=s2.length();
		
		
		if(l1>l2)
		{
			return 1;
		}
		if(l1<l2)
		{
			return -1;
		}
		else 
			return 0;

	}


}
