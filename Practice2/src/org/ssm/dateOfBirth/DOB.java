package org.ssm.dateOfBirth;

public class DOB 
{
	public static void main(String[] args) 
	{
		int current_date = 29; 
		int current_month = 6; 
		int current_year = 2019; 


		int birth_date = 22; 
		int birth_month = 11; 
		int birth_year = 1995;
		age(current_date, current_month, current_year,birth_date, birth_month, birth_year);

	}

	private static void age(int current_date, int current_month, int current_year, int birth_date, int birth_month,
			int birth_year)
	{
		int [] month={31,28,31,30,31,30,31,31,30,31,30,31};

		if(birth_date>current_date)
		{
			current_month=current_month-1;
			current_date=current_date+month[current_month-1];
		}
		if(birth_month>current_month)
		{
			current_year=current_year-1;
			current_month=current_month+12;


		}
		int calculated_date = current_date - birth_date; 
		int calculated_month = current_month - birth_month; 
		int calculated_year = current_year - birth_year; 
		
		System.out.println("Present Age"); 
        System.out.println("Years: " + calculated_year +  
              " Months: " + calculated_month + " Days: " +  
              calculated_date); 


	}

}
