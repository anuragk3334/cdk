package com.cdk.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Anurag
 *  Defining Customer Type 
 *  Adding Others - For those Customers who are not falling in any discounted offers
 */
@AllArgsConstructor
@Getter
public enum CustomerTypeEnum {
	
	REGULAR("Regular"),PREMIUM("Premium"),OTHERS("other");
	
	private String customerType;
	
	
	public static CustomerTypeEnum toEnum(String customerType){
		CustomerTypeEnum[] values = CustomerTypeEnum.values();
		for(CustomerTypeEnum customerTypeEnum :values) {
			if(customerType!=null && customerType.equalsIgnoreCase(customerTypeEnum.getCustomerType())) {
				return customerTypeEnum;
			}
		}
		return CustomerTypeEnum.OTHERS;
		
	}

}
