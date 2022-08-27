import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LocalInput11 
{
	public static void main(String[] args)     
	{
		//	LocalDate l1=LocalDate.now();
		//	System.out.println(l1);
		//	
		//	LocalDate l2=LocalDate.of(1996, Month.JUNE, 9);
		//	System.out.println(l2);
		//	Period p=Period.between(l2, l1);
		//	System.out.println(p.getDays());
		//	System.out.println(p.getMonths());
		//	System.out.println(p.getYears());
		//	  
		//	double a=355.13;
		//	int b=256;
		//	byte c=(byte)a;
		//	byte d=(byte)b;
		//	System.out.println(c+"  /n"+d  );
		//	
		/*LocalDate l1=LocalDate.now();
LocalDate l2=LocalDate.of(1996, Month.JUNE, 10);
Period p=Period.between(l2, l1);
System.out.println(p.getDays());
System.out.println(p.getMonths());
System.out.println(p.getYears());
String str="12-12-1996";

System.out.println(Integer.parseInt(str));*/
		LinkedList<String> my=new LinkedList<String>();
		my.add("a");
		my.add("b");
		my.add("c");
		my.add("d");
		my.add("e");
		my.add("x");
		//my.remove("a");
		my.add("m");
		System.out.println(my);
		for(String s:my)
		{
			System.out.print(s);
		}
		System.out.println("____");
		Iterator<String> itr=my.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}


		//Collections.rotate(my, -5);

		//my.add(0,"element");
		//Collections.rotate(my, -5);
		//System.out.println(my);
		/*Random rad=new Random();

		int sum=0;
		while(sum<=100)
		{
			int a=rad.nextInt(6);
			sum=sum=a;
		}
		System.out.println(sum);*/
		/*for (int i = 0; sum<=100; i++) 
		{
			int random=(int)(Math.random()*(6+1));
			sum=sum+random;
			System.out.print(sum+",");
			System.out.println();
			System.out.print(random+":");


		}*/
		/*System.out.println( );*/
		/*LocalDate l=LocalDate.now();
		LocalDate l2=LocalDate.of(1996, Month.JUNE, 9);
		Period p=Period.between(l2, l);
		System.out.println(p);
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
			System.out.println(p.getYears());*/


	}
}
