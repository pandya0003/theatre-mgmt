package com.parthpandya.theatremgmt.payment;

import java.math.BigDecimal;
import java.util.Optional;

import com.parthpandya.theatremgmt.model.Order;

public interface InterfacePaymentProcessor {
	
	static BigDecimal thirdPurchaseDiscount(BigDecimal arg) {
		return arg.multiply(BigDecimal.valueOf(0.5));
	}

	static BigDecimal afterNoonDiscount(BigDecimal arg) {
		return arg.multiply(BigDecimal.valueOf(0.8));
	}

	Optional<?> processPayment(String user, Order purchaseOrder, BigDecimal totalAmt, BigDecimal totalDiscounts);

}