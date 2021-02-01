package com.christien.googleguice.a_introduction.usingdependencyinjection.services;

import com.christien.googleguice.a_introduction.usingdependencyinjection.CreditCard;
import com.christien.googleguice.a_introduction.usingdependencyinjection.Order;

public interface BillingService {

    void chargeOrder(Order order, CreditCard creditCard);

}
