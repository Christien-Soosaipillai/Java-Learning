package com.christien.googleguice.a_introduction.usingdependencyinjection.services;

import com.christien.googleguice.a_introduction.usingdependencyinjection.CreditCard;
import com.christien.googleguice.a_introduction.usingdependencyinjection.Order;

public interface TransactionLog {

    void logTransaction(Order order, CreditCard card);

}
