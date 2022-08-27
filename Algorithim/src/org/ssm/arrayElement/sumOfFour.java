package org.ssm.arrayElement;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class sumOfFour 
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
		System.out.println(h);
		Set s=h.keySet();
		System.out.println(s);
		Set s1=h.entrySet();
		System.out.println(s1);
		Collection c=h.values();
		System.out.println(c);
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry e=(Map.Entry)itr.next();
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		System.out.println("jnzkjcnjabc");
		Map m=new TreeMap(h);
		Set s2=m.entrySet();
		Iterator itr1=s2.iterator();
		while(itr1.hasNext())
		{
			Map.Entry e1=(Map.Entry)itr1.next();
			System.out.println(e1.getKey()+"-->"+e1.getValue());
		}
		
		
		
	}
	

}
