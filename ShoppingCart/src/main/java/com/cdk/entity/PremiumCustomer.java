package com.cdk.entity;

import java.util.List;

import com.cdk.data.generator.PriceSlabGenerator;

/**
 * @author Anurag
 * PremiumCustomer related class
 *
 */
public class PremiumCustomer implements CustomerType {
	
	@Override
	public List<PriceSlab> getPriceSlabs() {
		PriceSlabGenerator datagenerator=new PriceSlabGenerator();
		return datagenerator.buildPriceSlabForPremium();
	}

}
