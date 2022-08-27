package org.ssm.MyOwnsorting;

import java.util.Comparator;

public class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		
		Integer emp1=(Integer) o1;
		Integer emp2=(Integer) o2;
		
		
		return -emp1.compareTo(emp2);
	}

}
