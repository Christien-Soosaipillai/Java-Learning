package com.christien.googleguice.e_constantBindings;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestConstantBindings {

    public static void main(String[] args){
        Injector injector = Guice.createInjector(new KeyCodeAuthenticatorModule());
        KeyCodeAuthenticator keyCodeAuthenticator = injector.getInstance(KeyCodeAuthenticator.class);
        keyCodeAuthenticator.authenticateKeyCode();

    }
}
