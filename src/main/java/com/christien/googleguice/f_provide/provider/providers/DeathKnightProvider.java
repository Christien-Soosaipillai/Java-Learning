package com.christien.googleguice.f_provide.provider.providers;

import com.christien.googleguice.f_provide.provider.services.BloodDeathKnight;
import com.christien.googleguice.f_provide.provider.services.DeathKnight;
import com.google.inject.Provider;

public class DeathKnightProvider implements Provider<DeathKnight> {
    @Override
    public DeathKnight get() {
        String username = "Foo_bar";
        Integer itemLevel = 160;
        DeathKnight deathKnight = new BloodDeathKnight(username, itemLevel);
        return deathKnight;
    }
}
