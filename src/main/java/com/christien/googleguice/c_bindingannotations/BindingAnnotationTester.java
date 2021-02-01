package com.christien.googleguice.c_bindingannotations;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class BindingAnnotationTester {

    public static void main(String[] args){

        Injector injector = Guice.createInjector(new TextEditorModule());

        AndroidTextEditor androidTextEditor = injector.getInstance(AndroidTextEditor.class);
        androidTextEditor.editText("Testing Text");

        PrintingPressTextEditor printingPressTextEditor = injector.getInstance(PrintingPressTextEditor.class);
        printingPressTextEditor.editText("Testing Text");

    }
}
