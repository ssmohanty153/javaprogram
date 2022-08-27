package COM.SSM.LinkeHashdset;

import java.util.LinkedHashSet;

public class Main 
{
	public static void main(String[] args)
	{
		LinkedHashSet hs=new LinkedHashSet() ;
		
		{
			hs.add(new Student(124,"rama",61.086));
			hs.add(new Student(125,"ramesh",78.9034));
			hs.add(new Student(125,"ramesh",78.9034));
			hs.add(new Student(127,"ramassm",88.3489));
			hs.add(new Student(128,"auhamesh",68.34));
			hs.add(new Student(129,"uhuimesh",57.340));
			hs.add(new Student(125,"ramesh",78.9034));
			for(Object obj:hs)
			{
				System.out.println(obj);
			}
			
		}
	}
	}



