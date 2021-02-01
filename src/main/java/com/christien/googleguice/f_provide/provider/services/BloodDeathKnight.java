package com.christien.googleguice.f_provide.provider.services;

public class BloodDeathKnight implements DeathKnight {

    private String username;
    private Integer itemLevel;

    public BloodDeathKnight(String username, Integer itemLevel) {
        this.username = username;
        this.itemLevel = itemLevel;
    }

    @Override
    public void stateSpecialization() {
        System.out.println("I am a Blood DeathKnight. My username is  " + username + " and my item level is " + itemLevel);
    }

}
