package com.christien.googleguice.introduction.usingnewkeyword.services;

import com.christien.googleguice.introduction.usingnewkeyword.CreditCard;
import com.christien.googleguice.introduction.usingnewkeyword.Order;


public class ChuckeyCheeseBillingService implements BillingService {

    @Override
    public void chargeOrder(Order order, CreditCard creditCard) {
        Double total = order.getOrderLog().stream().mapToDouble(Double::doubleValue).sum();

        //This code poses a problem for modularity and testability. There is a direct dependency on CreditCardProcessor meaning the billing service implementation relies
        //directly on the CreditCardProcessor implementation 'new PaypalCreditCardProcessor()'; We can't test individually on BillingService
        CreditCardProcessor processor = new PaypalCreditCardProcessor();
        TransactionLog transactionLog = new DatabaseTransactionLog();

        processor.processPayment(creditCard, total);
        transactionLog.logTransaction(order, creditCard);
    }

}
