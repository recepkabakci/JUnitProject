package com.bilgeadam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestFindMax {

	
	@Test
	void testFindMax() {
		assertEquals(5, FindMax.findMax(new int[] {1,3,2,5}));
	}

	
}
