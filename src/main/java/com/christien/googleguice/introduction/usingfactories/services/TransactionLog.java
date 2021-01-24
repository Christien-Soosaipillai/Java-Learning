package com.christien.googleguice.introduction.usingfactories.services;

import com.christien.googleguice.introduction.usingfactories.CreditCard;
import com.christien.googleguice.introduction.usingfactories.Order;

public interface TransactionLog {

    void logTransaction(Order order, CreditCard card);

}
