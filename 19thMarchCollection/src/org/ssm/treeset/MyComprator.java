package org.ssm.treeset;

import java.util.*;

public class MyComprator implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
		//		if(i1<i2)
		//			return -1;
		//		if(i1>i2)
		//			return +1;
		//		else
		//			return 0;
		//return -i2.compareTo(i1);
		//[10, 15, 100, 105, 150, 1110]

		//return i1.compareTo(i2);
		//[10, 15, 100, 105, 150, 1110]

		//return -i1.compareTo(i2);
		//[1110, 150, 105, 100, 15, 10]

		//return 1;
		
		//[10, 15, 100, 150, 1110, 105]

		return -1;
		
		//[105, 1110, 150, 100, 15, 10]


		//return 0;





	}


}

