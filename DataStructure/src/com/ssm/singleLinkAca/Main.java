package com.ssm.singleLinkAca;

public class Main 
{
	public static void main(String[] args) 
	{
		Employee jane = new Employee("jone", "jones", 123);
		Employee john = new Employee("jane", "jane", 193);
		Employee hare = new Employee("hare", "kaji", 144);
		Employee krishna = new Employee("krishna", "vsvgv",23);
		Employee ramn = new Employee("ramn", "sfzdv",88);



		EmployeeLInkedList list=new EmployeeLInkedList();
		list.addtoFront(jane);
		list.addtoFront(john);
		list.addtoFront(hare);
		list.addtoFront(krishna);
		list.printList();
		list.removeFromFront();
		list.printList();
	}
}

