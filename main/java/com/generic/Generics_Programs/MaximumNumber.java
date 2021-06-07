package com.generic.Generics_Programs;

public class MaximumNumber 
{
	
	//calculating Integer Type Maximum of Three Numbers using CompareTo method
	public static int checkMaximum(Integer x, Integer y, Integer z) {
		Integer max = x;
		if(y.compareTo(max) > 0) {
			max = y;  // y is largest
		}
		if(z.compareTo(max) > 0) {
			max = z;  // z is largest
		}
		return max;
	}
	
	public static float checkMaximum(Float x, Float y, Float z) {
		Float max = x;
		if(y.compareTo(max) > 0) {
			max = y;	// y is largest
		}
		if(z.compareTo(max) > 0) {
			max = z;	// z is largest
		}
		return max;
	}
	
	public static String checkMaximum(String x, String y, String z) {
		String max = x;
		if(y.compareTo(max) > 0) {
			max = y; 		
		}
		if(z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
	
	
	
	public static void main(String args[])
	{
		int a = checkMaximum(10, 20, 35);  // Passing Integer Type Input's
		System.out.println(a); 			   // Printing Integer Large Number 
		
		float b = checkMaximum(1.2f, 2.3f, 3.4f);		 // Passing Float Type Input's
		System.out.println(b);							// Printing Float Large Number 
		
		String c = checkMaximum("Apple", "Orange", "Banana");  // Passing String Type Input's
		System.out.println(c);								// Printing String Large Value with Alphabetic Order 
		
	}
	
	
}
