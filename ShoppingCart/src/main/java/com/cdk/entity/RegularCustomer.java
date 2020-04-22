package com.cdk.entity;

import java.util.List;

import com.cdk.data.generator.PriceSlabGenerator;

/**
 * @author Anurag
 * Regular Customer related Class
 *
 */
public class RegularCustomer implements CustomerType {

	@Override
	public List<PriceSlab> getPriceSlabs() {

		PriceSlabGenerator datagenerator=new PriceSlabGenerator();
		return datagenerator.buildPriceSlabForRegular();

	}

}
