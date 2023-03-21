package com.parthpandya.theatremgmt.payment.processor;

import java.math.BigDecimal;
import java.util.Optional;

import com.parthpandya.theatremgmt.model.Order;
import com.parthpandya.theatremgmt.payment.InterfacePaymentProcessor;

public class BitcoinPaymentProcessor implements InterfacePaymentProcessor{

	@Override
	public Optional<?> processPayment(String user, Order purchaseOrder, BigDecimal totalAmt, BigDecimal totalDiscounts) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
