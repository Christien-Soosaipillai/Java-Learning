package com.christien.googleguice.c_bindingannotations;

public class MicrosoftSpellChecker implements SpellChecker{

    @Override
    public void checkSpelling(String words) {
        System.out.println("Checking Spelling inside Microsoft Spell Checker");
    }
}
