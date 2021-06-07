package com.generic.Generics_Programs;

public class MaximumNumber 
{
	
	// Getting Method To Do all Operation using CompareTo method for 3 Paramenter's Value
	public static <T extends Comparable<T>> T checkMaximum(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max) > 0) {
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
	
	// Getting Method To Do all Operation using CompareTo method for More Then 3 Paramenter's Value
	public static <T extends Comparable<T>> T checkMaximum_With_MoreThan_ThreeParameters(T... elements) {
		T max = elements[0];
		for(T maximumParameter : elements) {
			if(maximumParameter.compareTo(max) > 0) {
				max = maximumParameter;
			}
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
		
		
		// Passing a More Parameter to the Integer,Float,String 
		
		Integer a1 = checkMaximum_With_MoreThan_ThreeParameters(10,20,35,40,45);  
		System.out.println(a1);													// Printing Large Value with for the More Parameter
		
		Float b1 = checkMaximum_With_MoreThan_ThreeParameters(1.2f, 2.3f, 3.4f,4.0f,5.2f);
		System.out.println(b1);
		
		String c1 = checkMaximum_With_MoreThan_ThreeParameters("Apple", "Orange", "Banana", "Watermelon", "Grapes"); 
		System.out.println(c1);
		
	}
	
	
}
