package com.self.interview.sorter;

import java.util.Comparator;

import com.self.interview.Person;

public class DateOfBirthSorter implements Comparator<Person> {

	public int compare(Person person1, Person person2) {
		return person1.getDateOfBirth().compareTo(person2.getDateOfBirth());
	}	
}	 
