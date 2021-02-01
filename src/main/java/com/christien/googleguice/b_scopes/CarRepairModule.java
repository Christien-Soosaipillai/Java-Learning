package com.christien.googleguice.b_scopes;

import com.google.inject.AbstractModule;

public class CarRepairModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(CarRepairService.class).to(MrLubeCarRepairService.class);
    }



}
