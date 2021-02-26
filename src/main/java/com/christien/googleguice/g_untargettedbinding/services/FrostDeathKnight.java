package com.christien.googleguice.g_untargettedbinding.services;

public class FrostDeathKnight implements DeathKnight {

    @Override
    public void stateSpecialization() {
        System.out.println("I am a Frost DeathKnight");
    }

}
