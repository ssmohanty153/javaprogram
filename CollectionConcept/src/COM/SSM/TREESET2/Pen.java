package COM.SSM.TREESET2;
	public class Pen implements Comparable
	{
	String colour;
	String cname;
	double price;
	public Pen(String colour, String cname, double price) 
	{
		this.colour = colour;
		this.cname = cname;
		this.price = price;
	}
	@Override
	public String toString()
	{
		return "Pen [colour=" + colour + ", cname=" + cname + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Object obj)
	{
		Pen p=(Pen)obj;
		if(this.price>p.price)
			return -1;
		else if(this.price<p.price)
		
		return +1;
		
		else
			return 0;
	}
	}

		


