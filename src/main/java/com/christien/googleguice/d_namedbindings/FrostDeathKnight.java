package com.christien.googleguice.d_namedbindings;

public class FrostDeathKnight implements DeathKnight {

    @Override
    public void stateSpecialization() {
        System.out.println("I am a Frost DK, I am a Damage Dealer");
    }
}
