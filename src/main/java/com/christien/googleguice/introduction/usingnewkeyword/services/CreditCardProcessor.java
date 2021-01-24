package com.christien.googleguice.introduction.usingnewkeyword.services;

import com.christien.googleguice.introduction.usingnewkeyword.CreditCard;

public interface CreditCardProcessor {

    boolean processPayment(CreditCard card, Double amount);
}
