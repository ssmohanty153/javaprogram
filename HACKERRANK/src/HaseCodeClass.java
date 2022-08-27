import java.util.HashSet;
import java.util.LinkedHashSet;

public class HaseCodeClass 
{
	public static void main(String[] args) 
	{
		Product p1=new Product(32, "HareKrishna", 10.2);
		Product p2=new Product(2, "rama", 10.3);
		Product p3=new Product(4, "Hare", 10.213);
		Product p4=new Product(4, "Krishna", 10.223);
		LinkedHashSet<Product> set=new LinkedHashSet<Product>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p3);
		System.out.println(set);
		for(Product p:set)
		{
			System.out.println(p);
		}


	}

}
