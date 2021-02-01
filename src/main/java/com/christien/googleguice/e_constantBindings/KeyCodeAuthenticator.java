package com.christien.googleguice.e_constantBindings;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyCodeAuthenticator {

    private List<String> REGISTERED_KEYCODES = new ArrayList<>(Arrays.asList(
            "TAWEFK2349DK3L", "ASDF38DK342", "CIDFDL3993KD", "YAW5I83JKD93"
    ));

    private String keyCode;

    @Inject
    public KeyCodeAuthenticator(@Named("Foo") String keyCode) {
        this.keyCode = keyCode;
    }

    public void authenticateKeyCode(){
        if(REGISTERED_KEYCODES.contains(keyCode)){
            System.out.println("KeyCode recognized, welcome!");
        }else{
            System.out.println("KeyCode is not recognized, please try again.");
        }
    }
}
