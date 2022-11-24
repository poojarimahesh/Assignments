package com.mahesh.assignments.assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class OOPSExampleTest {

	
	
	@Test
	public void testCurrentFailedWithdraw() {
		
		Current Mahesh = new Current("Mahesh",123456,8000);
		assertEquals(-1,Mahesh.withdrawAtBranch(2000));
	}
	
	
	
	@Test
	public void testCurrentSuccessfulWithdraw() {
		
		Current Mahesh = new Current("Mahesh",123456,80000);
		assertEquals(78000,Mahesh.withdrawAtBranch(2000));
	}
	
	@Test
	public void testSavingFailedWithdraw() {
		
		Current Mahesh = new Current("Mahesh",123456,5000);
		assertEquals(-1,Mahesh.withdrawAtBranch(2000));
		
	}
	@Test
	public void testDepositAtBranch() {
		
		Current Mahesh = new Current("Mahesh",123456,5000);
		assertEquals(7000,Mahesh.depositAtBranch(2000));
		
	}
	
	@Test
	public void testSavingSuccessfulWithdraw() {
		
		Saving Mahesh = new Saving("Mahesh",123456,8000);
		assertEquals(6000,Mahesh.withdrawAtBranch(2000));
	}

}
