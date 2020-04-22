package com.cdk.helper;

import java.math.BigDecimal;

import com.cdk.exception.AmountValidationException;

/**
 * @author Anurag
 * Converting String to BigDecimal and Exception handling
 */
public class BigDecimalHelper {

	 public static  BigDecimal convertStringToBigDecimal(String string) {
	        try {
	            BigDecimal actualPrice= new BigDecimal(string);
	            if(actualPrice.compareTo(BigDecimal.ZERO) >= 0) {
	            	return actualPrice;
	            }
	            else {
	            	throw AmountValidationException.
		        	newAmountValidationException("Input Amount is negative amount", null);
	            }
	        } catch (NumberFormatException exception) {
	        	throw AmountValidationException.
	        	newAmountValidationException("Input Amount is not valid", exception.getCause());
	           
	        } 
	       
	    }
}
