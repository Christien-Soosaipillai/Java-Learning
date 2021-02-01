package com.christien.googleguice.a_introduction.usingfactories.services;

import com.christien.googleguice.a_introduction.usingfactories.CreditCard;

public interface CreditCardProcessor {

    boolean processPayment(CreditCard card, Double amount);
}
