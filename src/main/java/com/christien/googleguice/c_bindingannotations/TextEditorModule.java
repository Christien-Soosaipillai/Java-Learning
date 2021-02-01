package com.christien.googleguice.c_bindingannotations;

import com.google.inject.PrivateModule;

public class TextEditorModule extends PrivateModule {

    /*
    *   A private module's configuration information is hidden from its environment by default. Only
    *   bindings that are explicitly 'exposed' will be available to other modules and to the users of the injector.
    *   -> expose(some.class)
    *   -> expose(SomethingIsGoingOn.class).annotatedWith(Something.class)
    * */

    @Override
    protected void configure() {
        bind(SpellChecker.class).annotatedWith(Microsoft.class).to(MicrosoftSpellChecker.class);
        bind(SpellChecker.class).annotatedWith(Android.class).to(AndroidSpellChecker.class);

        expose(SpellChecker.class).annotatedWith(Microsoft.class);
        expose(SpellChecker.class).annotatedWith(Android.class);
    }

}
