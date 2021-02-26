package com.christien.googleguice.g_untargettedbinding;

import com.christien.googleguice.g_untargettedbinding.modules.DungeonPartyCreatorModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestUntargettedBindings {

    public static void main(String[] args){
        Injector injector = Guice.createInjector(new DungeonPartyCreatorModule());
        DungeonPartyCreator dungeonPartyCreator = injector.getInstance(DungeonPartyCreator.class);
        dungeonPartyCreator.getPartyStats();
    }
}
