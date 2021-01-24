package com.christien.googleguice.introduction.usingnewkeyword.services;

import com.christien.googleguice.introduction.usingnewkeyword.CreditCard;

public class PaypalCreditCardProcessor implements CreditCardProcessor{

    @Override
    public boolean processPayment(CreditCard card, Double amount) {
        String codedNumber = "";
        String cardNumber = card.getCardNumber().toString();
        for(int i= 0; i < cardNumber.length(); i++){
            System.out.println(i);
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
