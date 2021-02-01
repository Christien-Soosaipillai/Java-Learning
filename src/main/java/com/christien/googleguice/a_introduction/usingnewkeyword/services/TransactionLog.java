package com.christien.googleguice.a_introduction.usingnewkeyword.services;

import com.christien.googleguice.a_introduction.usingnewkeyword.CreditCard;
import com.christien.googleguice.a_introduction.usingnewkeyword.Order;

public interface TransactionLog {

    void logTransaction(Order order, CreditCard card);

}
