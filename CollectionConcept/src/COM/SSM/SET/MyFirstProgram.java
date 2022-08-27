package COM.SSM.SET;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MyFirstProgram 
{
public static void main(String[] args) 
{
HashSet hs=new HashSet();
//System.out.println(hs.add("raja"));
//System.out.println(hs.add("raja"));
hs.add("raja");
hs.add("raju");
hs.add("ram");
hs.add("rama");
hs.add("rakewsh");
hs.add("krishna");
hs.add(null);
//Collections.sort(hs);
System.out.println(hs);
Iterator it=hs.iterator();
while (it.hasNext())
{
	System.out.println(it.next());
}





}
}
