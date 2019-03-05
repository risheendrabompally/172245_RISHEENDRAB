package test;

import org.junit.Assert;
import org.junit.Test;
	 
	public class MyAssertTrueTest {
	 
	    public boolean isEvenNumber(int number){
	         
	        boolean result = false;
	        if(number%2 == 0){
	            result = true;
	        }
	        return result;
	    }
	     
	    @Test
	    public void evenNumberTest(){
	        MyAssertTrueTest asft = new MyAssertTrueTest();
	        Assert.assertTrue(asft.isEvenNumber(4));
	    }
	}

