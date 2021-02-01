package com.christien.googleguice.f_provide.provider.services;

public class DruidHealer implements Healer {

    private String username;
    private Integer itemLevel;
    private String healingType;

    public DruidHealer(String username, Integer itemLevel, String healingType) {
        this.username = username;
        this.itemLevel = itemLevel;
        this.healingType = healingType;
    }

    @Override
    public void stateHealingType() {
        System.out.println("I am a " + healingType + " Druid Healer. My username is  " + username + " and my item level is " + itemLevel);
    }
}
