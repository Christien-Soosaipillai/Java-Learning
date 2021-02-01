package com.christien.googleguice.f_provide.provider;

import com.christien.googleguice.f_provide.provider.modules.DungeonPartyCreatorModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestProvider {

    public static void main(String[] args){
        Injector injector = Guice.createInjector(new DungeonPartyCreatorModule());
        DungeonPartyCreator dungeonPartyCreator = injector.getInstance(DungeonPartyCreator.class);
        dungeonPartyCreator.getPartyStats();
    }
}
