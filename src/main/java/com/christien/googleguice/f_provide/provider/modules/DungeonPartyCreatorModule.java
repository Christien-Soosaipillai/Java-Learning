package com.christien.googleguice.f_provide.provider.modules;

import com.christien.googleguice.f_provide.provider.providers.DeathKnightProvider;
import com.christien.googleguice.f_provide.provider.providers.HealerProvider;
import com.christien.googleguice.f_provide.provider.services.DeathKnight;
import com.christien.googleguice.f_provide.provider.services.Healer;
import com.google.inject.AbstractModule;

public class DungeonPartyCreatorModule extends AbstractModule{

    @Override
    protected void configure() {
        bind(Healer.class).toProvider(HealerProvider.class);
        bind(DeathKnight.class).toProvider(DeathKnightProvider.class);
    }
}
