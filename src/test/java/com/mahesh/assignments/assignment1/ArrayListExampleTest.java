package com.mahesh.assignments.assignment1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class ArrayListExampleTest {

	@Test
	public void testingForElementPresentInList() {
		ArrayList<Integer> actualArrayList = ArrayListExample.getArrayList();
		
		actualArrayList = ArrayListExample.deleteElementIfPresentInList(actualArrayList, 40);
		
		ArrayList<Integer> expectedArrayList = new ArrayList<Integer>();
		for(int i=1; i<=9;i++) {
			if(i==4) continue;
			expectedArrayList.add(i*10);
		}
		Assert.assertArrayEquals(expectedArrayList.toArray(), actualArrayList.toArray());
		
	}
	
	@Test
	public void testingForElementAbsentInList() {
		ArrayList<Integer> actualArrayList = ArrayListExample.getArrayList();
		
		actualArrayList = ArrayListExample.deleteElementIfPresentInList(actualArrayList, 45);
		
		ArrayList<Integer> expectedArrayList = new ArrayList<Integer>();
		for(int i=1; i<=9;i++) {
			expectedArrayList.add(i*10);
		}
		Assert.assertArrayEquals(expectedArrayList.toArray(), actualArrayList.toArray());
		
	}
    

}
