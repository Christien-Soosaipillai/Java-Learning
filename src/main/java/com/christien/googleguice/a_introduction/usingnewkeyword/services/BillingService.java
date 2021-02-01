package com.christien.googleguice.a_introduction.usingnewkeyword.services;

import com.christien.googleguice.a_introduction.usingnewkeyword.CreditCard;
import com.christien.googleguice.a_introduction.usingnewkeyword.Order;

public interface BillingService {

    void chargeOrder(Order order, CreditCard creditCard);

}
