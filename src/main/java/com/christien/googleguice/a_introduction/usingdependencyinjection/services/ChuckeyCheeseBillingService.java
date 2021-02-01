package com.christien.googleguice.a_introduction.usingdependencyinjection.services;

import com.christien.googleguice.a_introduction.usingdependencyinjection.CreditCard;
import com.christien.googleguice.a_introduction.usingdependencyinjection.Order;

import javax.inject.Inject;

public class ChuckeyCheeseBillingService implements BillingService {

    private CreditCardProcessor creditCardProcessor;
    private TransactionLog transactionLog;


    /*   Java class constructors that are annotated with @Inject can be called by Guice through a process called
        constructor injection, during which the constructors' arguments will be created and provided by Guice.
        Here ChuckeyCheeseBillingService declares that is need a CreditCartProcessor and TransactionLog. The @Inject
        marks this constructor as eligible to be used by Guice.
     */
    @Inject
    public ChuckeyCheeseBillingService(CreditCardProcessor creditCardProcessor, TransactionLog transactionLog) {
        this.creditCardProcessor = creditCardProcessor;
        this.transactionLog = transactionLog;
    }

    @Override
    public void chargeOrder(Order order, CreditCard creditCard) {
        Double total = order.getOrderLog().stream().mapToDouble(Double::doubleValue).sum();

        creditCardProcessor.processPayment(creditCard, total);
        transactionLog.logTransaction(order, creditCard);
    }

}
