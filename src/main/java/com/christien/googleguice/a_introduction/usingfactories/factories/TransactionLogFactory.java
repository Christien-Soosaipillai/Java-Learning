package com.christien.googleguice.a_introduction.usingfactories.factories;

import com.christien.googleguice.a_introduction.usingfactories.services.DatabaseTransactionLog;
import com.christien.googleguice.a_introduction.usingfactories.services.TransactionLog;

public class TransactionLogFactory {

    private static TransactionLog instance;

    public static void setInstance(TransactionLog transactionLog) {
        instance = transactionLog;
    }

    public static TransactionLog getInstance() {
        if (instance == null) {
            return new DatabaseTransactionLog();
        }

        return instance;
    }

}
