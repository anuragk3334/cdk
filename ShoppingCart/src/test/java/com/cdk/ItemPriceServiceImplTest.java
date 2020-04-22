package com.cdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cdk.exception.AmountValidationException;
import com.cdk.service.ItemPriceService;
import com.cdk.service.ItemPriceServiceImpl;

public class ItemPriceServiceImplTest {
   @Test
	public void testForRegularWithPurchaseAmount5k() {

	   ItemPriceService itemPriceService = new ItemPriceServiceImpl();
	   Double finalPrice = itemPriceService.getFinalPrice("5000", "REGULAR");
	   assertEquals(5000, finalPrice);
	   
		
	}
   
   @Test
 	public void testForRegularWithPurchaseAmount10k() {

 	   ItemPriceService itemPriceService = new ItemPriceServiceImpl();
 	   Double finalPrice = itemPriceService.getFinalPrice("10000.0", "REGULAR");
 	   assertEquals(9500, finalPrice);
 	   
 		
 	}
   
   @Test
	public void testForRegularWithPurchaseAmount15k() {

	   ItemPriceService itemPriceService = new ItemPriceServiceImpl();
	   Double finalPrice = itemPriceService.getFinalPrice("15000.0", "REGULAR");
	   assertEquals(13500, finalPrice);
	   
		
	}
   
   @Test
	public void testForRegularWithPurchaseAmount0k() {

	   ItemPriceService itemPriceService = new ItemPriceServiceImpl();
	   Double finalPrice = itemPriceService.getFinalPrice("0", "REGULAR");
	   assertEquals(0, finalPrice);
	   
		
	}
   

   @Test
	public void testForPremiumWithPurchaseAmount4k() {

	   ItemPriceService itemPriceService = new ItemPriceServiceImpl();
	   Double finalPrice = itemPriceService.getFinalPrice("4000.0", "PREMIUM");
	   assertEquals(3600, finalPrice);
	   
		
	}
   
   @Test
  	public void testForPremiumWithPurchaseAmount0k() {

  	   ItemPriceService itemPriceService = new ItemPriceServiceImpl();
  	   Double finalPrice = itemPriceService.getFinalPrice("0", "PREMIUM");
  	   assertEquals(0, finalPrice);
  	   
  		
  	}
   
   @Test
	public void testForPremiumWithPurchaseAmount8k() {

	   ItemPriceService itemPriceService = new ItemPriceServiceImpl();
	   Double finalPrice = itemPriceService.getFinalPrice("8000.0", "PREMIUM");
	   assertEquals(7000, finalPrice);
	   
		
	}
   
   @Test
	public void testForPremiumWithPurchaseAmount12k() {

	   ItemPriceService itemPriceService = new ItemPriceServiceImpl();
	   Double finalPrice = itemPriceService.getFinalPrice("12000.0", "PREMIUM");
	   assertEquals(10200, finalPrice);
	   
		
	}
   
   @Test
	public void testForPremiumWithPurchaseAmount20k() {

	   ItemPriceService itemPriceService = new ItemPriceServiceImpl();
	   Double finalPrice = itemPriceService.getFinalPrice("20000.0", "PREMIUM");
	   assertEquals(15800, finalPrice);
	   
		
	}
   
   @Test
  	public void testForOthersWithPurchaseAmount20k() {

  	   ItemPriceService itemPriceService = new ItemPriceServiceImpl();
  	   Double finalPrice = itemPriceService.getFinalPrice("20000.0", "XYZ");
  	   assertEquals(20000, finalPrice);
  	   
  		
  	}
   
   @Test
 	public void testForOthersWithPurchaseAmountxyzk() {

 	   ItemPriceService itemPriceService = new ItemPriceServiceImpl();
 	   
 	  assertThrows(AmountValidationException.class, () -> {
 		 itemPriceService.getFinalPrice("xyz", "XYZ");
 	    });
 	}
   
   @Test
 	public void testForNullWithPurchaseAmount20k() {

 	   ItemPriceService itemPriceService = new ItemPriceServiceImpl();
 	   Double finalPrice = itemPriceService.getFinalPrice("20000.0", null);
 	   assertEquals(20000, finalPrice);
 	   
 		
 	}
   
   @Test
	public void testForRegularWithPurchaseAmountNegativek() {

	   ItemPriceService itemPriceService = new ItemPriceServiceImpl();
	   assertThrows(AmountValidationException.class, () -> {
		   itemPriceService.getFinalPrice("-2", "REGULAR");
	 	    });
	  
	   
		
	}
   
   
}
