package com.cdk;

import java.util.Scanner;

import com.cdk.service.ItemPriceService;
import com.cdk.service.ItemPriceServiceImpl;

public class ShoppingCart {

	public static void main(String[] args) {
		System.out.println("Enter Original Price :");
		Scanner scanner = new Scanner(System.in);
		String originalPrice=scanner.nextLine();
		System.out.println("Enter Customertype as Premium or Regular :");
		String customerType=scanner.nextLine();
		
		ItemPriceService itemPriceService = new ItemPriceServiceImpl();
		double discountedPrice = itemPriceService.getFinalPrice(originalPrice, customerType);
		System.out.println("Price after Discount is  " + discountedPrice);
	}
}
