package com.christien.googleguice.introduction.usingfactories.services;

import com.christien.googleguice.introduction.usingfactories.CreditCard;
import com.christien.googleguice.introduction.usingfactories.Order;

public interface BillingService {

    void chargeOrder(Order order, CreditCard creditCard);

}
