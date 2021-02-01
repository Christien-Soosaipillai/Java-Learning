package com.christien.googleguice.c_bindingannotations;


import javax.inject.Inject;
import com.google.inject.BindingAnnotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@BindingAnnotation @Target({ ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD }) @Retention(RetentionPolicy.RUNTIME)
@interface Android{}
public class AndroidTextEditor{

    private SpellChecker spellChecker;

    @Inject
    public AndroidTextEditor(@Android SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void editText(String text) {
        spellChecker.checkSpelling(text);
    }
}
