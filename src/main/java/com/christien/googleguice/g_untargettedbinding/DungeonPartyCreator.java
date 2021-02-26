package com.christien.googleguice.g_untargettedbinding;

import com.christien.googleguice.g_untargettedbinding.services.DeathKnight;

import javax.inject.Inject;

public class DungeonPartyCreator {

    private DeathKnight deathKnight;

    @Inject
    public DungeonPartyCreator(DeathKnight deathKnight) {
        this.deathKnight = deathKnight;
    }

    public void getPartyStats(){
        deathKnight.stateSpecialization();
    }
}
