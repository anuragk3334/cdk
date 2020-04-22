package com.cdk.entity;

import java.util.List;

import com.cdk.data.generator.PriceSlabGenerator;

/**
 * @author Anurag
 * Those Customers which are not falling inside special discounted category
 */
public class OtherCustomer implements CustomerType{

	@Override
	public List<PriceSlab> getPriceSlabs() {
		PriceSlabGenerator datagenerator=new PriceSlabGenerator();
		return datagenerator.buildPriceSlabForOthers();
	}

}
