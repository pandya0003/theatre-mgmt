package com.parthpandya.theatremgmt.payment.processor;

import java.math.BigDecimal;
import java.util.Optional;

import org.apache.logging.log4j.util.Strings;

import com.parthpandya.theatremgmt.model.Order;
import com.parthpandya.theatremgmt.model.Transaction;
import com.parthpandya.theatremgmt.payment.InterfacePaymentProcessor;

public class StripePaymentProcessor implements InterfacePaymentProcessor{
	
	@Override
	public Optional<Transaction> processPayment(String user, Order purchaseOrder, BigDecimal totalAmt, BigDecimal totalDiscounts) {
		//service layer should do all validation, clean up or exception handling. If we are here then lets just do this
		Transaction newBooking = new Transaction();
		newBooking.setUserEmail(user);
		newBooking.setClientIp("127.0.0.1");
		newBooking.setPaymentType(Strings.EMPTY);
		newBooking.setRefunded(false);
		newBooking.setProcessorTransactionID("STRIPE_TXN_ID_32429349");
		newBooking.setCinema(purchaseOrder.getScreen().getCinema());
		Double cost = totalAmt.subtract(totalDiscounts).doubleValue();
		newBooking.setAmount(cost);
		
		return Optional.of(newBooking);
	}

}
