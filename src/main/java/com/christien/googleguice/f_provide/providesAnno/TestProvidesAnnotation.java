package com.christien.googleguice.f_provide.providesAnno;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestProvidesAnnotation {

    public static void main(String[] args){

        Injector injector = Guice.createInjector(new DungeonPartyCreatorModule());
        DungeonPartyCreator dungeonPartyCreator = injector.getInstance(DungeonPartyCreator.class);
        dungeonPartyCreator.getStats();

    }

}
