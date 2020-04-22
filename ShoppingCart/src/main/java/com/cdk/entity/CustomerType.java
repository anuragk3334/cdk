/**
 * 
 */
package com.cdk.entity;

import java.util.List;

/**
 * @author Anurag
 * Interface defined for Customer Category
 *
 */
public interface CustomerType {
	
	/**
	 * @return Applicable Price slabs based on Customer Category
	 */
	public List<PriceSlab> getPriceSlabs();

}
