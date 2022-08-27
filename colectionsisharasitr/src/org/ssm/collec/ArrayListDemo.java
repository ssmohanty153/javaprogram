package org.ssm.collec;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		HashSet<String> h=new HashSet<String>();
		h.add("ajit");
		h.add("ajitbabu");
		h.add("kjit");
		h.add("kljitbabu");
		h.add("klkkjit");
		h.add("lkijjit");
		ArrayList<String> st=new ArrayList<String>(h);
		System.out.println(st);
		
	}
  
}
