package COM.SSM.LinkeHashdset;

public class Student implements Comparable 
{
		int id;
		String name;
		double per;
		public Student(int id, String name, double per) 
		{
			super();
			this.id = id;
			this.name = name;
			this.per = per;
		}
		@Override
		public String toString() 
		{
			return this.id+"  "+this.name+"   "+this.per;
		}
		public int hashCode() 
		{
			return id;
		}
		public boolean equals(Object obj)
		{
		return this.hashCode()==obj.hashCode();
		}
		//@Override
//		public int compareTo(Object arg0) 
//		{
//		  if(this.id==ano.id)
//			  
//		}
}
