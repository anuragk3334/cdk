package com.cdk.service;

public interface ItemPriceService {
	
	/**
	 * @param actualAmount -in String format
	 * @param customer -CustomerType REGULAR,PREMIUM , OR ANY FUTURISTIC 
	 * @return - Discounted Price based on CustomerType and actualAmount
	 */
	public Double getFinalPrice(String actualAmount, String customer);

}
