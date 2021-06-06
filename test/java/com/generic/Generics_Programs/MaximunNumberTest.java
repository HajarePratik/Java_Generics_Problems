package com.generic.Generics_Programs;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaximunNumberTest 
{
  
   
	MaximumNumber maximum= new MaximumNumber();;

 
    @Test
    public void Given_Max_Number_at_1st_Position_return_the_Same_Number() {
        Integer maximumResult=maximum.checkMaximumNum(5,4,3);
        Integer expected=5;
        Assert.assertEquals(expected,maximumResult);
    }
    @Test
    public void Given_Max_Number_at_2nd_Position_return_the_Same_Number(){
        Integer maximumResult=maximum.checkMaximumNum(4,5,3);
        Integer expected=5;
        Assert.assertEquals(expected,maximumResult);
    }
    @Test
    public void Given_Max_Number_at_3rd_Position_return_the_Same_Number() {
        Integer maximumResult=maximum.checkMaximumNum(3,4,5);
        Integer expected=5;
        Assert.assertEquals(expected,maximumResult);
    }
 
}
