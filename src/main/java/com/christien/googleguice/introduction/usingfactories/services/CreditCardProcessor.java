package com.christien.googleguice.introduction.usingfactories.services;

import com.christien.googleguice.introduction.usingfactories.CreditCard;

public interface CreditCardProcessor {

    boolean processPayment(CreditCard card, Double amount);
}
