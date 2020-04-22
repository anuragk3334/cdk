package com.cdk.service;

import java.math.BigDecimal;

import com.cdk.builder.CustomerTypeBuilder;
import com.cdk.constants.Constants;
import com.cdk.constants.CustomerTypeEnum;
import com.cdk.entity.CustomerType;
import com.cdk.entity.PriceSlab;
import com.cdk.helper.BigDecimalHelper;

/**
 * @author Anurag
 * Algo - 
 * 1.Get actualPrice and CustomerType as Input
 * 2.Filter all Price slabs where actualPrice Item lies 
 * 3.Calcualte discounts in all applicable slabs
 * 4.Sum all discounts
 * 5.Get result of actualPrice-totalDiscount
 * 6. If CustomerType is not specific (like Premium or Regular) , then Customer is defined in OtherCustomer category and no discount is applicable
 *
 */
public class ItemPriceServiceImpl implements ItemPriceService {

	@Override
	public Double getFinalPrice(String purchaseAmout, String customer){
		
		BigDecimal purchaseAmount = BigDecimalHelper.convertStringToBigDecimal(purchaseAmout.toString());
		CustomerType customerType = CustomerTypeBuilder.getCustomerType(CustomerTypeEnum.toEnum(customer));
		
		BigDecimal totalDiscount =  customerType.getPriceSlabs().
				                    stream().
				                    filter(priceSlab -> purchaseAmount.compareTo(priceSlab.getMin()) >=Constants.ZERO).
				                    map(priceSlab -> {return getDiscountOnEveryPriceSlab(purchaseAmount, priceSlab);}).
				                    reduce((discount1, discount2) -> discount1.add(discount2)).
				                    get();

		return purchaseAmount.subtract(totalDiscount).doubleValue();

	}

	private BigDecimal getDiscountOnEveryPriceSlab(BigDecimal purchaseAmout, PriceSlab priceSlab) {
		
		BigDecimal discount = null;
		BigDecimal maxValue = priceSlab.getMax();
		BigDecimal minValue = priceSlab.getMin();
		BigDecimal discountPercentage = priceSlab.getDiscount();

		if (purchaseAmout.compareTo(maxValue) == Constants.ONE) {
			discount = (maxValue.subtract(minValue)).multiply(discountPercentage);
		} else {
			discount = (purchaseAmout.subtract(minValue)).multiply(discountPercentage);
		}
		return discount;
	}

	
	
	 

}
