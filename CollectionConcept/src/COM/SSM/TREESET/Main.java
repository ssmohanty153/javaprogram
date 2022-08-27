package COM.SSM.TREESET;

import java.util.Iterator;
import java.util.TreeSet;
public class Main 
{
public static void main(String[] args) 
{
	TreeSet ts=new TreeSet();
	ts.add(15);
	ts.add(23);
	ts.add(45);
	ts.add(253);
	ts.add(152);
	ts.add(2093);
	ts.add(915);
	ts.add(2398);
	ts.add(15);
	ts.add(23);
	System.out.println(ts);
	Iterator it=ts.iterator();
	while (it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
	
	
}
}
