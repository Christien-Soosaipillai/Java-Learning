package com.christien.googleguice.d_namedbindings;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestNamedBindings {

    public static void main(String[] args){
        Injector injector = Guice.createInjector(new DungeonPartyCreatorModule());
        DungeonPartyCreator dungeonPartyCreator = injector.getInstance(DungeonPartyCreator.class);
        dungeonPartyCreator.getFirstMember();

    }

}
