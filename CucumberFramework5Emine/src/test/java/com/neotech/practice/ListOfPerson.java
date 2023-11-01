package com.neotech.practice;

import java.util.ArrayList;
import java.util.List;

public class ListOfPerson {
	public static void main(String[] args) {
		List<Person> ListOfPeople = new ArrayList<>();
		
		ListOfPeople.add(new Person("Emine", 43));
		ListOfPeople.add(new Person ("Dincer",50));
		ListOfPeople.add(new Person ("Seray",10));
		ListOfPeople.add(new Person ("Mustafa",6));
		
		System.out.println(ListOfPeople);
		
		for( Person p:ListOfPeople) {
			System.out.println(p);//bu sekilde butun degerler alt alta gelir
			
		}
	}

}


class Person
{
	String name;
	int age;
	
	
	public Person ( String name, int age) 
	{
		this.name=name;
		this.age=age;
	}
	
	public String toString() 
	{
		
		return name + ":"+ age;
	}
	
}