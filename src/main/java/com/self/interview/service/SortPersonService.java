package com.self.interview.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.self.interview.Person;
import com.self.interview.sorter.DateOfBirthSorter;
import com.self.interview.sorter.FirstNameSorter;
import com.self.interview.sorter.HeightSorter;
import com.self.interview.sorter.LastNameSorter;
import com.self.interview.sorter.SsnSorter;
import com.self.interview.sorter.WeightSorter;

public class SortPersonService {


	public static List<Person> sort(Iterable<Person> people, String sortField, String ascending) {
		List<Person> peopleList = new ArrayList<Person>();
		for(Person per: people)
			peopleList.add(per);

		sortField = sortField.toLowerCase();
		Boolean ascendingOrder = Boolean.parseBoolean(ascending);

		switch(sortField) {
		case "ssn":
			sortList(peopleList, ascendingOrder, new SsnSorter());
			break;


		case "firstname":
			sortList(peopleList, ascendingOrder, new FirstNameSorter());
			break;

		case "lastname":
			sortList(peopleList, ascendingOrder, new LastNameSorter());
			break;


		case "dateofbirth":
			sortList(peopleList, ascendingOrder, new DateOfBirthSorter());
			break;


		case "weightlb":
			sortList(peopleList, ascendingOrder, new WeightSorter());
			break;


		case "heightin":
			sortList(peopleList, ascendingOrder, new HeightSorter());
			break;
		}
		
		return peopleList;
	}
	
	/**
	 * Sorts the list using the comparator and a boolean flag 
	 * @param list - list to be sorted
	 * @param ascending - boolean flag indicating whether its sorted ascending or descending
	 * @param comparator - comparator to compare the objects in the list
	 */
	private static void sortList(List<Person> list, Boolean ascending, Comparator<Person> comparator) {
		if(ascending) 
			Collections.sort(list, comparator);
		else
			Collections.sort(list, Collections.reverseOrder(comparator));
	}

}
