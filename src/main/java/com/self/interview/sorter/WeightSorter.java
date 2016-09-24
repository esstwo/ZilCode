package com.self.interview.sorter;

import java.util.Comparator;

import com.self.interview.Person;

public class WeightSorter implements Comparator<Person> {

	public int compare(Person person1, Person person2) {
		return person1.getWeightLb().compareTo(person2.getWeightLb());
	}	
}	 
