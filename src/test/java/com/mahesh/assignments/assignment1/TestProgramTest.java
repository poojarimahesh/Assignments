package com.mahesh.assignments.assignment1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class TestProgramTest {

	@Test
	public void testingRemoveDuplicates() {
		ArrayList<Integer> actualArrayList = new ArrayList<Integer>();
        actualArrayList.add(1);
        actualArrayList.add(2);
        actualArrayList.add(1);
        actualArrayList.add(3);
        actualArrayList.add(4);
        actualArrayList.add(2);
        actualArrayList.add(1);
        System.out.println("Collection elements before deleting duplicates elements : ");
        System.out.println(actualArrayList);
        
        TestProgram.deletingElementsHavingDuplicates(actualArrayList);
        ArrayList<Integer> expectedArrayList = new ArrayList<Integer>();
        expectedArrayList.add(3);
        expectedArrayList.add(4);
//        assertEquals([3,4],arrayList);
//        assertEquals(arrayList.toArray(), arrayList.toArray());
        assertArrayEquals(expectedArrayList.toArray(),actualArrayList.toArray());
	}

}
