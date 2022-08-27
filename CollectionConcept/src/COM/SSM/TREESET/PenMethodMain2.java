package COM.SSM.TREESET;

import java.util.Iterator;
import java.util.TreeSet;

public class PenMethodMain2 
{
public static void main(String[] args)
{
	TreeSet ts=new TreeSet();
	 ts.add(new Pen("red","cello",34.64));
	 ts.add(new Pen("blue","linc",5));
	 ts.add(new Pen("yellow","linc",3.64));
	 ts.add(new Pen("black","writometer",18.26));
	 ts.add(new Pen("blueBlack","renold",120.36));
	 ts.add(new Pen("green","cello",35.64));
	 Iterator it=ts.iterator();
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	 
}
}
