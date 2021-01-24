package com.christien.googleguice.introduction.usingfactories.services;

import com.christien.googleguice.introduction.usingfactories.CreditCard;
import com.christien.googleguice.introduction.usingfactories.Order;

public class DatabaseTransactionLog implements TransactionLog {

    @Override
    public void logTransaction(Order order, CreditCard card) {
        System.out.println("Using Database Transaction Logger...");
        double total = 0;
        for(double price : order.getOrderLog()){
            System.out.println(price);
            total += price;
        }

        System.out.println("Final Price: " + total);
    }

}
