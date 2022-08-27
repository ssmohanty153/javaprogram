package org.ssm.arrayElement;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortByVAlue 
{
	public static void main(String[] args)
	{	
		HashMap h=new HashMap();
		h.put(1, "h");
		h.put(2, "b");
		h.put(5, "l");
		h.put(3, "f");
		h.put(8, "c");
		h.put(110, "v");
		h.put(11, "w");
		h.put(16, "z");
		h.put(17, "y");
		h.put(19, "o");
		Set s=h.entrySet();
		Iterator i1=s.iterator();
		while(i1.hasNext())
		{
			Map.Entry m1=(Map.Entry)i1.next();
			System.out.println(m1.getKey()+"-->"+m1.getValue());

		}

		Map map2=sortByVal(h);
		Set s2=map2.entrySet();
		Iterator i2=s2.iterator();
		while(i2.hasNext())
		{
			Map.Entry m2=(Map.Entry)i2.next();
			System.out.println(m2.getKey()+"-->"+m2.getValue());


		}


	}

	static Map sortByVal(HashMap map) 
	{
		List l1=new LinkedList(map.entrySet());



		Collections.sort(l1, new Comparator() 
		{

			@Override
			public int compare(Object o1, Object o2)
			{
				return ((Comparable) ((Map.Entry) (o1)).getValue())
						.compareTo(((Map.Entry) (o2)).getValue());

			}

		});

		HashMap hm=new LinkedHashMap();
		Iterator itr3=l1.iterator();
		while(itr3.hasNext())
		{
			Map.Entry m3=(Map.Entry)itr3.next();
			hm.put(m3.getKey(), m3.getValue());


		}

		return hm  ;
	}
}
