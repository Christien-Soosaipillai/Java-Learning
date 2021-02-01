package com.christien.googleguice.a_introduction.usingfactories.services;

import com.christien.googleguice.a_introduction.usingfactories.CreditCard;

public class PaypalCreditCardProcessor implements CreditCardProcessor {

    @Override
    public boolean processPayment(CreditCard card, Double amount) {
        System.out.println("Factory implementation: ");
        String codedNumber = "";
        String cardNumber = card.getCardNumber().toString();
        for(int i= 0; i < cardNumber.length(); i++){
            if((cardNumber.length() - i) <= 4 ){
                codedNumber += cardNumber.substring(i, i+1);
            }else{
                codedNumber += "*";
            }
        }
        System.out.println("CARD NUMBER: " + codedNumber);
        return card.getLimit() > amount;
    }

}
