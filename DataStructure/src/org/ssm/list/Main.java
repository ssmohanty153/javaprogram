package org.ssm.list;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
	public static void main(String[] args) 
	{
		List<Employee> employeeList=new ArrayList<>();


		employeeList.add(new Employee("hare","krishnA",11 ));

		employeeList.add(0,  new Employee("hare","RAM",133 ));
		employeeList.forEach(employee->System.out.println(employee));

	}



}
