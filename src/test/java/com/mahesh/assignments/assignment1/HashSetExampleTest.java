package com.mahesh.assignments.assignment1;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

public class HashSetExampleTest {

	@Test
	public void testingForAddingAbsentElement() {

		HashSet<Integer> hashSet = HashSetExample.getHashSet();
		assertTrue(hashSet.add(22));
		
	}
	
	@Test
	public void  testingForAddingAlreadyPresentElement() {

		HashSet<Integer> hashSet = HashSetExample.getHashSet();
		assertFalse(hashSet.add(30));
		
	}
	
	@Test
	public void  testingForDeletingAlreadyPresentElement() {

		HashSet<Integer> hashSet = HashSetExample.getHashSet();
		assertTrue(hashSet.remove(30));
		
	}
	
	@Test
	public void  testingForDeletingAbsentElement() {

		HashSet<Integer> hashSet = HashSetExample.getHashSet();
		assertFalse(hashSet.remove(11));
		
	}

}
