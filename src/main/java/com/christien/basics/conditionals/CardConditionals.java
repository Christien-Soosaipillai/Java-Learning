package com.christien.basics.conditionals;

import com.christien.basics.objandclasses.Dog;

public class CardConditionals {

    /*
    Object − Objects have states and behaviors. Example: A dog has states - color, name, breed as well as
           behavior such as wagging their tail, barking, eating. An object is an instance of a class.

    Class − A class can be defined as a template/blueprint that describes the behavior/state
          that the object of its type supports.

    Methods − A method is basically a behavior. A class can contain many methods. It is in methods
            where the logics are written, data is manipulated and all the actions are executed.

    Instance Variables − Each object has its unique set of instance variables. An object's state is
                       created by the values assigned to these instance variables.
    */

    public static void main(String[] args) {

        TradingCard card = TradingCard.assignTradingCard();
        double x = Math.random();

        switch(card){
            case YUGIOH:
                if(x < 0.3){
                    System.out.println("Elemental Warrior Deck");
                }else if(x > 0.3 && x < 0.6){
                    System.out.println("BlackWing Deck");
                }else{
                    System.out.println("Burning Abyss Deck");
                }
            case POKEMON:
                if(x < 0.5){
                    System.out.println("Fire Type");
                }else{
                    System.out.println("Grass Type");
                }
            case DIGIMON:
                System.out.println("Digimon");
        }

    }
}
