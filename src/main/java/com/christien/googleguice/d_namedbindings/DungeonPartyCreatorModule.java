package com.christien.googleguice.d_namedbindings;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class DungeonPartyCreatorModule extends AbstractModule{

    @Override
    protected void configure() {
        bind(DeathKnight.class).annotatedWith(Names.named("BloodDeathknight")).to(BloodDeathKnight.class);
        bind(DeathKnight.class).annotatedWith(Names.named("FrostDeathknight")).to(FrostDeathKnight.class);
    }
}
