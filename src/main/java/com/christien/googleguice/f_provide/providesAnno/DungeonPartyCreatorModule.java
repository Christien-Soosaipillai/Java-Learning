package com.christien.googleguice.f_provide.providesAnno;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class DungeonPartyCreatorModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
    }

    @Provides
    public DeathKnight provideDeathKnight(){
        String username = "Foo_bar";
        Integer itemLevel = 160;
        DeathKnight deathKnight = new BloodDeathKnight(username, itemLevel);
        return deathKnight;
    }

}
