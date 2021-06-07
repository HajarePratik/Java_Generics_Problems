package com.generic.Generics_Programs;

import org.junit.Test;


public class MaximunNumberTest 
{

	// Declearing a Inner Class to call assertEquals method for the Different Datatype's
	public static class Assertions {
		public static void assertEquals(int i, Integer maximumNum) 
		{

		}
		public static void assertEquals(float i, Float maximumNum) 
		{

		}


	}

	// Testing a Integer Value in JUnit
	@Test
	public void givenMaxNumAtFirstPosition_ShouldReturnSameNum() {
		Integer maximumNum = MaximumNumber.checkMaximum(10,20,35);
		Assertions.assertEquals(10, maximumNum);
		System.out.println(maximumNum);
	}

	@Test
	public void givenMaxNumAtSecondPosition_ShouldReturnSameNum() {
		Integer maximumNum = MaximumNumber.checkMaximum(10,20,35);
		Assertions.assertEquals(20, maximumNum);
		System.out.println(maximumNum);
	}
	
	@Test
	public void givenMaxNumAtThirdPosition_ShouldReturnSameNum() {
		Integer maximumNum = MaximumNumber.checkMaximum(10,20,35);
		Assertions.assertEquals(35, maximumNum);
		System.out.println(maximumNum);
	}
	
	
	// Testing a Integer Value in JUnit
	@Test
	public void givenMaxFloatNumAtFirstPosition_ShouldReturnSameNum() {
		Float maximumNum = MaximumNumber.checkMaximum(1.2f, 2.3f, 3.4f);
		Assertions.assertEquals(1.2f, maximumNum);
		System.out.println(maximumNum);
	}
	
	@Test
	public void givenMaxFloatNumAtSecondPosition_ShouldReturnSameNum() {
		Float maximumNum = MaximumNumber.checkMaximum(1.2f, 2.3f, 3.4f);
		Assertions.assertEquals(2.3f, maximumNum);
		System.out.println(maximumNum);
	}
	
	@Test
	public void givenMaxFloatNumAtThirdPosition_ShouldReturnSameNum() {
		Float maximumNum = MaximumNumber.checkMaximum(1.2f, 2.3f, 3.4f);
		Assertions.assertEquals(3.4f, maximumNum);
		System.out.println(maximumNum);
	}
	



 
}
