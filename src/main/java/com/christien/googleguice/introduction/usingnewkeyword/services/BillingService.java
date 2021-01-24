package com.christien.googleguice.introduction.usingnewkeyword.services;

import com.christien.googleguice.introduction.usingnewkeyword.CreditCard;
import com.christien.googleguice.introduction.usingnewkeyword.Order;

public interface BillingService {

    void chargeOrder(Order order, CreditCard creditCard);

}
