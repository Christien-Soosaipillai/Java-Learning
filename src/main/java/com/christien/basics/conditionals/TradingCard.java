package com.christien.basics.conditionals;

import com.christien.basics.objandclasses.Dog;

public enum TradingCard {

    YUGIOH  (1),
    POKEMON (2),
    DIGIMON (3);

    private final int order;

    TradingCard(int order){
        this.order = order;
    }

    public static TradingCard assignTradingCard(){
        double x = Math.random();
        if(x < 0.3){
            return TradingCard.YUGIOH;
        }else if(x > 0.3 && x < 0.6){
            return TradingCard.POKEMON;
        }else{
            return TradingCard.DIGIMON;
        }
    }

    public int getOrder(){
        return order;
    }
}
