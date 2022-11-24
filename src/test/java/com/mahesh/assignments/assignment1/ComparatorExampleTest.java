package com.mahesh.assignments.assignment1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class ComparatorExampleTest {

	@Test
	public void testSortingByComparator() {
//		ComparatorExample comp = new ComparatorExample();
		ArrayList<Laptop> laptopList = ComparatorExample.getArrayList();
		ArrayList<Laptop> actualSortedLaptop = ComparatorExample.sortArrayListUsingComparator(laptopList);
//		ArrayList<String> expectedSortedLaptopList = new ArrayList<>();
		ArrayList<Laptop> expectedSortedLaptopList = new ArrayList<>();
		expectedSortedLaptopList.add(new Laptop("HP",40000,8));
		expectedSortedLaptopList.add(new Laptop("ACER",55000,16));
		expectedSortedLaptopList.add(new Laptop("DELL",60000,16));
		expectedSortedLaptopList.add(new Laptop("LENOVO",70000,16));
		
		
		
		
//		expectedSortedLaptopList.add("HP");
//		expectedSortedLaptopList.add("ACER");
//		expectedSortedLaptopList.add("DELL");
//		expectedSortedLaptopList.add("LENOVO");
//		ArrayList<String> actualSortedLaptopList = new ArrayList<>();
//		for(Laptop element : actualSortedLaptop) {
//			actualSortedLaptopList.add(element.getBrand());
//		}
//		System.out.println(expectedSortedLaptopList);
//		System.out.println(actualSortedLaptop.toArray());
//		Assert.assertEquals(expectedSortedLaptopList, actualSortedLaptop);
//		assertTrue(actualSortedLaptopList.size() == expectedSortedLaptopList.size() && actualSortedLaptopList.containsAll(expectedSortedLaptopList) && expectedSortedLaptopList.containsAll(actualSortedLaptopList));
//	    assertTrue(expectedSortedLaptopList.equals(actualSortedLaptopList));
//		assertEquals(expectedSortedLaptopList,actualSortedLaptopList);
//		Assert.assertThat(null, null);
//		System.out.println(expectedSortedLaptopList.toString());
//		System.out.println(actualSortedLaptop.toString());
		assertEquals(expectedSortedLaptopList.toString(),actualSortedLaptop.toString());
//		Assert.assertTrue(actualSortedLaptopList).isEqualToComparingFieldByField(expectedSortedLaptopList);
	}

}


















