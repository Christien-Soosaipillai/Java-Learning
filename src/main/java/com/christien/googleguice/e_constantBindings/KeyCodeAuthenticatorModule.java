package com.christien.googleguice.e_constantBindings;

import com.google.inject.PrivateModule;
import com.google.inject.name.Names;

public class KeyCodeAuthenticatorModule extends PrivateModule {
    @Override
    protected void configure() {
        bind(String.class).annotatedWith(Names.named("Christien")).toInstance("TAWEFK2349DK3L");
        bind(String.class).annotatedWith(Names.named("Foo")).toInstance("ASDF38DK342");
        bind(String.class).annotatedWith(Names.named("Bar")).toInstance("CIDFDL3993KD");
        bind(String.class).annotatedWith(Names.named("InteJerz")).toInstance("YAW5I83JKD93");

        expose(String.class).annotatedWith(Names.named("Christien"));
        expose(String.class).annotatedWith(Names.named("Foo"));
    }
}
