package com.cdk.builder;

import com.cdk.constants.CustomerTypeEnum;
import com.cdk.entity.CustomerType;
import com.cdk.entity.OtherCustomer;
import com.cdk.entity.PremiumCustomer;
import com.cdk.entity.RegularCustomer;

/**
 * @author Anurag
 * Builder to construct object of Customer Type
 *
 */
public class CustomerTypeBuilder {

	private static CustomerType customerType;

	public static CustomerType getCustomerType(CustomerTypeEnum customer) {

		switch (customer) {
		case REGULAR:
			customerType = new RegularCustomer();
			break;

		case PREMIUM:
			customerType = new PremiumCustomer();
			break;
		default :
			customerType= new OtherCustomer();
		}
		return customerType;

	}

}
