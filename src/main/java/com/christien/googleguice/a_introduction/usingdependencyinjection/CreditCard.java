package com.christien.googleguice.a_introduction.usingdependencyinjection;

public class CreditCard {

    private Integer cardNumber;
    private String firstName;
    private String lastName;
    private Double limit;

    public CreditCard(Integer cardNumber, String firstName, String lastName, Double limit) {
        this.cardNumber = cardNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.limit = limit;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getLimit() {
        return limit;
    }
}
