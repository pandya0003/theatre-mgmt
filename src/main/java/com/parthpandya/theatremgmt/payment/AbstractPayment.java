package com.parthpandya.theatremgmt.payment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import com.parthpandya.theatremgmt.model.Order;
import com.parthpandya.theatremgmt.model.Transaction;
import com.parthpandya.theatremgmt.payment.processor.BitcoinPaymentProcessor;
import com.parthpandya.theatremgmt.payment.processor.PaypalPaymentProcessor;
import com.parthpandya.theatremgmt.payment.processor.StripePaymentProcessor;

public abstract class AbstractPayment {
	public static Optional<Transaction> checkoutBooking(Order purchaseOrder) {
		if(purchaseOrder != null) {
			InterfacePaymentProcessor processor = getProcessor(purchaseOrder.getPaymentMethod());
			List<BigDecimal> discounts = new ArrayList<>();
			if(purchaseOrder.getQty() >= 3) {
				int times = purchaseOrder.getQty() / 3;
				BigDecimal discount = InterfacePaymentProcessor.thirdPurchaseDiscount(new BigDecimal("12"));
				discounts.add(discount.multiply(new BigDecimal(times)));
			}
			
			Calendar c = Calendar.getInstance();
			int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
			if(timeOfDay >= 12 && timeOfDay < 16){
				BigDecimal discount = InterfacePaymentProcessor.thirdPurchaseDiscount(new BigDecimal("12"));
				discounts.add(discount);
			}
			
			BigDecimal totalDiscounts = !discounts.isEmpty() ? discounts.stream().reduce((x, y) -> x.add(y)).get() : new BigDecimal(0);
			BigDecimal totalAmt = new BigDecimal(purchaseOrder.getScreen().getMovie().getPrice() * purchaseOrder.getQty());
			return (Optional<Transaction>) processor.processPayment(purchaseOrder.getUserEmail(), purchaseOrder, totalAmt, totalDiscounts);
		}
		return Optional.empty();
	} 
	
	
	// This can be further refined with pure abstract factory but not needed unnecessary for this assignment scope.
	private static InterfacePaymentProcessor getProcessor(String paymentType){
        if("PAYPAL".equalsIgnoreCase(paymentType)){
            return new PaypalPaymentProcessor();
        } else if("BITCOIN".equalsIgnoreCase(paymentType)){
            return new BitcoinPaymentProcessor();
        } else {
        	return new StripePaymentProcessor();
        }
    }

}
