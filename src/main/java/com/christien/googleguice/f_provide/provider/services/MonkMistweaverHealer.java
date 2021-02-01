package com.christien.googleguice.f_provide.provider.services;

public class MonkMistweaverHealer implements Healer {

    private String username;
    private Integer itemLevel;
    private String healingType;

    public MonkMistweaverHealer(String username, Integer itemLevel, String healingType) {
        this.username = username;
        this.itemLevel = itemLevel;
        this.healingType = healingType;
    }

    @Override
    public void stateHealingType() {
        System.out.println("I am a " + healingType + " MistWeaver Monk. My username is  " + username + " and my item level is " + itemLevel);
    }
}
