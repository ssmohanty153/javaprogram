package org.ssm.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetSicronized
{
public static void main(String[] args) 
{
	ArrayList l=new ArrayList();
	List l1=Collections.synchronizedList(l);
}
}
