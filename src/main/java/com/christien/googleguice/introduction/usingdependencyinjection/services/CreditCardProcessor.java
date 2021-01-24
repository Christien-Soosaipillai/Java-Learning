package com.christien.googleguice.introduction.usingdependencyinjection.services;

import com.christien.googleguice.introduction.usingdependencyinjection.CreditCard;

public interface CreditCardProcessor {

    boolean processPayment(CreditCard card, Double amount);
}
