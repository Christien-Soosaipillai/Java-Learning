package com.christien.objectoriented.inheritanceandpolymorphism;

import com.google.common.collect.ImmutableMap;

import java.text.NumberFormat;
import java.util.List;

public class FoodStore extends FoodProducer{

    ImmutableMap<String, Double> PRICE_LIST = ImmutableMap.of(
            "apple", 2.99,
            "banana", 3.25,
            "orange", 3.20
    );

    public void getSumAmount(List<String> shoppingList){
        double total = 0;
        for(String str : shoppingList){
            double price = PRICE_LIST.get(str.toLowerCase());
            NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
            total += price;
            System.out.println(str+": " + priceFormat.format(price));
        }
        System.out.println("Here is your final total:\n$" + total);
    }

}
