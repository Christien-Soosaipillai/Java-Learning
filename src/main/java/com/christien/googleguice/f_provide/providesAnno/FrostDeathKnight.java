package com.christien.googleguice.f_provide.providesAnno;

public class FrostDeathKnight implements DeathKnight {

    private String username;
    private Integer itemLevel;

    public FrostDeathKnight(String username, Integer itemLevel) {
        this.username = username;
        this.itemLevel = itemLevel;
    }

    @Override
    public void stateSpecialization() {
        System.out.println("I am a Frost DeathKnight. My username is  " + username + " and my item level is " + itemLevel);
    }
}
