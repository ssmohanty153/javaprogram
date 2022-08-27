package org.ssm.treeset;

import java.util.*;

public class TreeDemoBuffer3 
{
public static void main(String[] args) 
{

	TreeSet ts=new TreeSet(new MyText());
	
	ts.add(new StringBuffer("aask"));
	ts.add(new StringBuffer("aff"));
	ts.add(new StringBuffer("ad"));
	ts.add(new StringBuffer("x"));
	System.out.println(ts);
}
}
