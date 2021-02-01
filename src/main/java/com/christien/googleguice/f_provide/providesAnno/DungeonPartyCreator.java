package com.christien.googleguice.f_provide.providesAnno;

import javax.inject.Inject;

public class DungeonPartyCreator {

    private DeathKnight deathKnight;

    @Inject
    public DungeonPartyCreator(DeathKnight deathKnight) {
        this.deathKnight = deathKnight;
    }

    public void getStats(){
        deathKnight.stateSpecialization();
    }


}
