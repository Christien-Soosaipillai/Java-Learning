package com.christien.googleguice.c_bindingannotations;

public class AndroidSpellChecker implements SpellChecker{

    @Override
    public void checkSpelling(String words) {
        System.out.println("Checking Spelling inside Android Spell Checker");
    }
}
