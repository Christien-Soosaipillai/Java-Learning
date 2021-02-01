package com.christien.googleguice.b_scopes;

import javax.inject.Inject;

public class ServiceDesk {

    CarRepairService carRepairService;

    @Inject
    public ServiceDesk(CarRepairService carRepairService) {
        this.carRepairService = carRepairService;
    }

    public void serviceCar(){
        carRepairService.repair();
    }
}
