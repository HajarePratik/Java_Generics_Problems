package com.generic.Generics_Programs;

public class MaximumNumber 
{
	//calculating Integer Type Maximum of Three Numbers using CompareTo method
	public static int checkMaximumNum(Integer x, Integer y, Integer z) {
		Integer max = x;
		if(y.compareTo(max) > 0) {
			max = y; // y is largest
		}
		if(z.compareTo(max) > 0) {
			max = z; // z is largest
		}
		return max;
	}
	
	public static void main(String[] args) {
		int maxintnumber = checkMaximumNum(10,20,35);  // Passing Input's
		System.out.println(maxintnumber);				// Printing Large Number
	}
}
