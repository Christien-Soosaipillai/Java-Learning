package com.christien.googleguice.introduction.usingfactories;

import com.christien.googleguice.introduction.usingfactories.services.BillingService;
import com.christien.googleguice.introduction.usingfactories.services.ChuckeyCheeseBillingService;

import java.util.ArrayList;
import java.util.Arrays;

public class ChuckeyCheeseCheckout {

    public static void main(String[] args){

        //This is how things are done without using Factories
        Order order = new Order(new ArrayList<Double>(Arrays.asList(12.99,5.99,8.99,4.99)));
        CreditCard creditCard = new CreditCard(1234567890,"Inte","Jerz", 200.00);

        BillingService billingService = new ChuckeyCheeseBillingService();
        billingService.chargeOrder(order, creditCard);

    }

}
