package com.christien.googleguice.g_untargettedbinding.services;

public class BloodDeathKnight implements DeathKnight {

    @Override
    public void stateSpecialization() {
        System.out.println("I am a Blood DeathKnight");
    }

}
