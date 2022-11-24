package com.mahesh.assignments.assignment1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ComparableExampleTest {

	@Test
	public void testSortingByComparable() {
		
		ArrayList<Laptop> laptopList = ComparableExample.getArrayList();
		ArrayList<Laptop> actualSortedLaptopList = ComparableExample.sortArrayListUsingComparable(laptopList);
		
		ArrayList<Laptop> expectedSortedLaptopList = new ArrayList<Laptop>();
		
		expectedSortedLaptopList.add(new Laptop("HP",40000,8));
		expectedSortedLaptopList.add(new Laptop("ACER",55000,16));
		expectedSortedLaptopList.add(new Laptop("DELL",60000,16));
		expectedSortedLaptopList.add(new Laptop("LENOVO",70000,16));
		
		assertEquals(expectedSortedLaptopList.toString(),actualSortedLaptopList.toString());
		
		
		
	}

}
