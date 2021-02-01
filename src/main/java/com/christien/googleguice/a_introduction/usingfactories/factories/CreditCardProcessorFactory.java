package com.christien.googleguice.a_introduction.usingfactories.factories;

import com.christien.googleguice.a_introduction.usingfactories.services.CreditCardProcessor;
import com.christien.googleguice.a_introduction.usingfactories.services.PaypalCreditCardProcessor;

public class CreditCardProcessorFactory {

    private static CreditCardProcessor instance;

    public static void setInstance(CreditCardProcessor processor) {
        instance = processor;
    }

    public static CreditCardProcessor getInstance() {
        if (instance == null) {
            return new PaypalCreditCardProcessor();
        }

        return instance;
    }

}
