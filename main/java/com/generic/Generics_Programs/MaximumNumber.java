package com.generic.Generics_Programs;

public class MaximumNumber <T extends Comparable<T>> 
{
	
		T x, y, z;
	
	public MaximumNumber(T x, T y, T z) {
	
			this.x = x;
			this.y = y;
			this.z = z;
		}

	//Getting the Largest of Three Comparable Object
	public static <T extends Comparable<T>> T checkMaximum(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max) > 0) {
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max = z;
		}
		printMax(max);
		return max;
	}

	public static String checkMaximum(String x, String y, String z) {
		String max = x;
		if(y.compareTo(max) > 0) {
			max = y; 	// y is the largest 
		}
		if(z.compareTo(max) > 0) {
			max = z; 	// z is the largest
		}
		printMax( max);
		return max; 	// returns largest value
	}
	
	public static <T> void printMax(T max) {
		System.out.println("Maximum Value in There Type is :" + max);
	}
	
	
	
	public static void main(String args[])
	{
		Integer a = checkMaximum(10, 20, 35);  		// Passing Integer Type Input's
		Float b = checkMaximum(1.2f, 2.3f, 3.4f);	// Passing Float Type Input's

		String A ="Apple", B ="Orange", C = "Banana";  // Passing String Type Input's
		MaximumNumber.checkMaximum(A, B, C);           
		
	}
	
	
}
