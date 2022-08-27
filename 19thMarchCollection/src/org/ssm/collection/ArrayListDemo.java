package org.ssm.collection;

import java.util.*;

public class ArrayListDemo 
{
public static void main(String[] args) 
{
	ArrayList ar=new ArrayList();
	ar.add("rama");
	ar.add("hari");
	ar.add("krishna");
	ar.add("little");
	ar.add("sila");
	ar.add("anuja");
	ar.add("sargum");
	ar.add(null);
	ar.add(10);
	System.out.println(ar);
	ar.remove(5);
	System.out.println(ar);
	ar.add(5, "HareKrishna");
	System.out.println(ar);
	System.out.println(ar.size());
	ar.set(5, "rama rama");
	System.out.println(ar);
	System.out.println(ar.get(4));
	ar.add(5, "subhransu sekhar mohanty");
	System.out.println(ar.size());
}
}
