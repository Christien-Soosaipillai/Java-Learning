package com.christien.googleguice.introduction.usingnewkeyword.services;

import com.christien.googleguice.introduction.usingnewkeyword.CreditCard;
import com.christien.googleguice.introduction.usingnewkeyword.Order;

public class DatabaseTransactionLog implements TransactionLog{

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
