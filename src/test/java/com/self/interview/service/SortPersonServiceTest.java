package com.self.interview.service;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.self.interview.Person;

public class SortPersonServiceTest {
	
	private List<Person> buildData(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<Person> list = new ArrayList<Person>();
		try {
			list.add(new Person("123", sdf.parse("1950-05-26"), "Jonh", "Doe", 60.0, 100.0));
			list.add(new Person("230", sdf.parse("1980-04-26"), "Mary", "Jane", 55.0, 180.0));
			list.add(new Person("111", sdf.parse("1955-03-19"), "Bob", "Smith", 62.0, 150.0));	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@Test
	public void testSsnSort(){
		List<Person> unsorted = buildData();
		List<Person> sorted = SortPersonService.sort((Iterable<Person>)unsorted, "ssn", "true");
		
		assertEquals("111", sorted.get(0).getSsn());
		assertEquals("123", sorted.get(1).getSsn());
		assertEquals("230", sorted.get(2).getSsn());
	}
	
	@Test
	public void testSsnReverseSort(){
		List<Person> unsorted = buildData();
		List<Person> sorted = SortPersonService.sort((Iterable<Person>)unsorted, "ssn", "false");
		
		assertEquals("111", sorted.get(2).getSsn());
		assertEquals("123", sorted.get(1).getSsn());
		assertEquals("230", sorted.get(0).getSsn());
	}
	
	
	
	@Test
	public void testHeightSort(){
		List<Person> unsorted = buildData();
		List<Person> sorted = SortPersonService.sort((Iterable<Person>)unsorted, "heightin", "true");
		
		assertEquals(new Double(55.0), sorted.get(0).getHeightIn());
		assertEquals(new Double(60.0), sorted.get(1).getHeightIn());
		assertEquals(new Double(62.0), sorted.get(2).getHeightIn());
	}
	
	@Test
	public void testHeightReverseSort(){
		List<Person> unsorted = buildData();
		List<Person> sorted = SortPersonService.sort((Iterable<Person>)unsorted, "heightin", "false");
		
		assertEquals(new Double(55.0), sorted.get(2).getHeightIn());
		assertEquals(new Double(60.0), sorted.get(1).getHeightIn());
		assertEquals(new Double(62.0), sorted.get(0).getHeightIn());
	}
	
	
	@Test
	public void testWeightSort(){
		List<Person> unsorted = buildData();
		List<Person> sorted = SortPersonService.sort((Iterable<Person>)unsorted, "weightlb", "true");
		
		assertEquals(new Double(100.0), sorted.get(0).getWeightLb());
		assertEquals(new Double(150.0), sorted.get(1).getWeightLb());
		assertEquals(new Double(180.0), sorted.get(2).getWeightLb());
	}
	
	@Test
	public void testWeightReverseSort(){
		List<Person> unsorted = buildData();
		List<Person> sorted = SortPersonService.sort((Iterable<Person>)unsorted, "weightlb", "false");
		
		assertEquals(new Double(100.0), sorted.get(2).getWeightLb());
		assertEquals(new Double(150.0), sorted.get(1).getWeightLb());
		assertEquals(new Double(180.0), sorted.get(0).getWeightLb());
	}

}
