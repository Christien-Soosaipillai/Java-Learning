package com.christien.googleguice.a_introduction.usingfactories;

import java.util.List;

public class Order {

    private List<Double> orderLog;

    public Order(List<Double> orderLog) {
        this.orderLog = orderLog;
    }

    public List<Double> getOrderLog() {
        return orderLog;
    }
}
