package com.christien.googleguice.d_namedbindings;

import javax.inject.Inject;
import javax.inject.Named;

public class DungeonPartyCreator {

    private DeathKnight deathKnight;

    @Inject
    public DungeonPartyCreator(@Named("BloodDeathknight") DeathKnight deathKnight) {
        this.deathKnight = deathKnight;
    }

    public void getFirstMember(){
        deathKnight.stateSpecialization();
    }
}
