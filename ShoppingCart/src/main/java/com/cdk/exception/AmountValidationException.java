package com.cdk.exception;

import lombok.AllArgsConstructor;

/**
 * @author Anurag
 * exception if purchase amount isnot valid
 */
@AllArgsConstructor
public class AmountValidationException extends RuntimeException {
	
	private String message;
	private Throwable throwable;
	
	public static AmountValidationException newAmountValidationException(String message,Throwable throwable) {
		return new AmountValidationException(message,throwable);
	}
	
	

}
