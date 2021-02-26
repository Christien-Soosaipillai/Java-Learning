package com.christien.googleguice.g_untargettedbinding.services;

import com.google.inject.ImplementedBy;

@ImplementedBy(BloodDeathKnight.class)
public interface DeathKnight {

    public void stateSpecialization();

}
