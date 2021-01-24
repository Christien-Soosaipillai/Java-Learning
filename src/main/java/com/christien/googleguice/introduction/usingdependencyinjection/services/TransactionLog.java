package com.christien.googleguice.introduction.usingdependencyinjection.services;

import com.christien.googleguice.introduction.usingdependencyinjection.CreditCard;
import com.christien.googleguice.introduction.usingdependencyinjection.Order;

public interface TransactionLog {

    void logTransaction(Order order, CreditCard card);

}
