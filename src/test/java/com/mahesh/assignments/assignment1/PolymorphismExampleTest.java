package com.mahesh.assignments.assignment1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PolymorphismExampleTest {

	@Test
	public void testingAreaOfSquare() {
		Rectangle r = new Rectangle();
		assertEquals(100,r.area(10));
	}
	
	@Test
	public void testingAreaOfRectangle() {
		Rectangle r = new Rectangle();
		assertEquals(100,r.area(10,10));
	}
	
	
	@Test
	public void testingAreaOfCircle() {
		Circle c = new Circle();
		Assert.assertEquals(314.0d, c.area(10),0);
	}

}
