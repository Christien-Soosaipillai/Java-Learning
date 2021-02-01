package com.christien.googleguice.a_introduction.usingdependencyinjection.services;

import com.christien.googleguice.a_introduction.usingdependencyinjection.CreditCard;

public interface CreditCardProcessor {

    boolean processPayment(CreditCard card, Double amount);
}
