package com.christien.googleguice.f_provide.provider;

import com.christien.googleguice.f_provide.provider.services.DeathKnight;
import com.christien.googleguice.f_provide.provider.services.Healer;

import javax.inject.Inject;

public class DungeonPartyCreator {

    private Healer healer;
    private DeathKnight deathKnight;

    @Inject
    public DungeonPartyCreator(Healer healer, DeathKnight deathKnight) {
        this.healer = healer;
        this.deathKnight = deathKnight;
    }

    public void getPartyStats(){
        healer.stateHealingType();
        deathKnight.stateSpecialization();
    }
}
