package com.christien.googleguice.a_introduction.usingnewkeyword.services;

import com.christien.googleguice.a_introduction.usingnewkeyword.CreditCard;

public interface CreditCardProcessor {

    boolean processPayment(CreditCard card, Double amount);
}
