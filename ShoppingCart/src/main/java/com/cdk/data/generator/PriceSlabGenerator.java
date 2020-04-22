package com.cdk.data.generator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.cdk.entity.PriceSlab;

/**
 * @author Anurag
 * Price Slab Configuration for different categories of Customer 
 */
public class PriceSlabGenerator {
	public List<PriceSlab> buildPriceSlabForPremium() {
		List<PriceSlab> priceSlabs = new ArrayList<PriceSlab>();
		PriceSlab slab1 = new PriceSlab(BigDecimal.valueOf(0), BigDecimal.valueOf(4000), BigDecimal.valueOf(0.1));
		PriceSlab slab2 = new PriceSlab(BigDecimal.valueOf(4000), BigDecimal.valueOf(8000), BigDecimal.valueOf(0.15));
		PriceSlab slab3 = new PriceSlab(BigDecimal.valueOf(8000), BigDecimal.valueOf(12000), BigDecimal.valueOf(0.2));
		PriceSlab slab4 = new PriceSlab(BigDecimal.valueOf(12000), BigDecimal.valueOf(Integer.MAX_VALUE), BigDecimal.valueOf(0.3));
		priceSlabs.add(slab1);
		priceSlabs.add(slab2);
		priceSlabs.add(slab3);
		priceSlabs.add(slab4);
		return priceSlabs;
	}

	public List<PriceSlab> buildPriceSlabForRegular() {
		List<PriceSlab> priceSlabs = new ArrayList<PriceSlab>();
		PriceSlab slab1 = new PriceSlab(BigDecimal.valueOf(0), BigDecimal.valueOf(5000), BigDecimal.valueOf(0));
		PriceSlab slab2 = new PriceSlab(BigDecimal.valueOf(5000), BigDecimal.valueOf(10000), BigDecimal.valueOf(0.1));
		PriceSlab slab3 = new PriceSlab(BigDecimal.valueOf(10000), BigDecimal.valueOf(Integer.MAX_VALUE),
				BigDecimal.valueOf(0.2));
		priceSlabs.add(slab1);
		priceSlabs.add(slab2);
		priceSlabs.add(slab3);

		return priceSlabs;
	}
	
	public List<PriceSlab> buildPriceSlabForOthers() {
		List<PriceSlab> priceSlabs = new ArrayList<PriceSlab>();
		PriceSlab slab1 = new PriceSlab(BigDecimal.valueOf(0), BigDecimal.valueOf(Integer.MAX_VALUE), BigDecimal.valueOf(0));
		priceSlabs.add(slab1);
		return priceSlabs;
	}

}
