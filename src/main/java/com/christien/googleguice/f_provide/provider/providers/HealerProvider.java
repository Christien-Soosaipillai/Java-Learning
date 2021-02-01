package com.christien.googleguice.f_provide.provider.providers;

import com.christien.googleguice.f_provide.provider.services.DruidHealer;
import com.christien.googleguice.f_provide.provider.services.Healer;
import com.google.inject.Provider;

public class HealerProvider implements Provider<Healer> {
    @Override
    public Healer get() {
        String username = "Foo_bar";
        Integer itemLevel = 160;
        String healingType = "'Healing Over Time'";
        Healer healer = new DruidHealer(username, itemLevel, healingType);
        return healer;
    }
}
