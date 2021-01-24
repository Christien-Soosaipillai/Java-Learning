package com.christien.googleguice.introduction.usingfactories.services;

import com.christien.googleguice.introduction.usingfactories.CreditCard;
import com.christien.googleguice.introduction.usingfactories.Order;
import com.christien.googleguice.introduction.usingfactories.factories.*;

public class ChuckeyCheeseBillingService implements BillingService {

    @Override
    public void chargeOrder(Order order, CreditCard creditCard) {
        Double total = order.getOrderLog().stream().mapToDouble(Double::doubleValue).sum();

        //Here we use a factory class to decouple the client and implementing class. This will help us set mock implementations for our interfaces
        //However for this we will have to constantly keep creating new factories to keep track of
        CreditCardProcessor processor = CreditCardProcessorFactory.getInstance();
        TransactionLog transactionLog = TransactionLogFactory.getInstance();

        processor.processPayment(creditCard, total);
        transactionLog.logTransaction(order, creditCard);
    }

}
