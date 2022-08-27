import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class LocalDateFind 
{
	public static void main(String[] args) throws ParseException 
	{
		String str="22-10-1996";
		SimpleDateFormat for1=new SimpleDateFormat("dd-mm-yyyy");
		
		Date date1=for1.parse(str);
		Calendar c=Calendar.getInstance();
		c.setTime(date1);
		int day=c.get(Calendar.DATE);
		int month=c.get(Calendar.MONTH);
		int year=c.get(Calendar.YEAR);
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
		LocalDate now=LocalDate.now();
		System.out.println(now);
	//	LocalDate pre=LocalDate.of(year, month, day);
	//	System.out.println();
		//Period diff1=Period.between(pre, now);
		//System.out.println("age"+diff1.getDays()+"year");
		

		
		
	}

}
