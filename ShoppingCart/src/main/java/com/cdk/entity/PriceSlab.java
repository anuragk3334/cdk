package com.cdk.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public class PriceSlab {
	
	private BigDecimal min;
	private BigDecimal max;
	private BigDecimal discount;

}
