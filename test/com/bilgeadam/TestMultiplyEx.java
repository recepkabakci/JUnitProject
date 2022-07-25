package com.bilgeadam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class TestMultiplyEx {
	
	MultiplyEx multiplyEx;
	
	@BeforeEach
	void setUp() {
		multiplyEx= new MultiplyEx();	
	}
	@Test
	void testMultiplyEx() {
		assertEquals(20, multiplyEx.multiply(4,5),"Regular multiplication");
	}
	@RepeatedTest(5)
	@DisplayName("Ensure correct handling of zero")
	void testMultiplyWithZero() {
		assertEquals(0,  multiplyEx.multiply(0,5));
		assertEquals(0,  multiplyEx.multiply(4,0));
	}
}
