package com.christien.googleguice.introduction.usingdependencyinjection.services;

import com.christien.googleguice.introduction.usingdependencyinjection.CreditCard;
import com.christien.googleguice.introduction.usingdependencyinjection.Order;

public interface BillingService {

    void chargeOrder(Order order, CreditCard creditCard);

}
