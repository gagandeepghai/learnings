package com.learn.basics;

import org.junit.Assert;
import org.junit.Test;

public class BasicFlowsAndChecksTests {
	
	BasicFlowsAndChecks checks = new BasicFlowsAndChecks();

	@Test
	public void testWeirdness() {
		for (int i = 0; i < 25; ++i) {
			Assert.assertEquals("Not Weird", checks.weirdOrNot(i));
		}
	}
	
	@Test
	public void testDiceIt() {
		Assert.assertEquals("lowo", checks.diceIt("Helloworld", 3, 7));
	}
	
	@Test
	public void testGetSmallestAndLargest() {
		Assert.assertEquals("ava-wel", checks.getSmallestAndLargest("welcometojava", 3));
	}
	
}
