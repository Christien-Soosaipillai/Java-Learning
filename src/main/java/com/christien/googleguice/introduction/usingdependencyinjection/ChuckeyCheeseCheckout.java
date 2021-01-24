package com.christien.googleguice.introduction.usingdependencyinjection;

import com.christien.googleguice.introduction.usingdependencyinjection.modules.BillingModule;
import com.christien.googleguice.introduction.usingdependencyinjection.services.BillingService;
import com.christien.googleguice.introduction.usingdependencyinjection.services.ChuckeyCheeseBillingService;
import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.ArrayList;
import java.util.Arrays;

public class ChuckeyCheeseCheckout {

    public static void main(String[] args){

        //This is how things are done without using Factories
        Order order = new Order(new ArrayList<Double>(Arrays.asList(12.99,5.99,8.99,4.99)));
        CreditCard creditCard = new CreditCard(1234567890,"Inte","Jerz", 200.00);

        Injector injector = Guice.createInjector(new BillingModule());
        BillingService billingService = injector.getInstance(BillingService.class);
        billingService.chargeOrder(order, creditCard);

    }

}
