package com.christien.googleguice.d_namedbindings;

public class BloodDeathKnight implements DeathKnight {

    @Override
    public void stateSpecialization() {
        System.out.println("I am a Blood DK, I am a Tank");
    }
}
