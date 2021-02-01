package com.christien.googleguice.a_introduction.usingfactories.services;

import com.christien.googleguice.a_introduction.usingfactories.CreditCard;
import com.christien.googleguice.a_introduction.usingfactories.Order;

public interface BillingService {

    void chargeOrder(Order order, CreditCard creditCard);

}
