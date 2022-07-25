package com.bilgeadam;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMyMath {
	@BeforeEach  
	public void before() {
		System.out.println("Before");	
	}
	@AfterEach
	public void after() {
		System.out.println("After");		
	}
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
	}
	
	@Test
	void test() {
		MyMath myMath= new MyMath();
		int result = myMath.sum(new int[] {2,4,3});
		assertEquals(9, result);
		System.out.println("inside sum with Jnumbers test");
	}
	@Test
	void sum_with2numbers() {
		MyMath myMath = new MyMath();
		int result =  myMath.sum(new int[] {2,3});
		assertEquals(5, result);
		System.out.println("inside sum with Jnumbers test");
	}

}
