package com.christien.googleguice.b_scopes;

public class MidasCarRepairService implements CarRepairService {

    private double repairTime;

    public MidasCarRepairService() {
        this.repairTime = Math.random();
    }

    @Override
    public void repair() {
        System.out.println("Repair Time:" + (repairTime * 10.0));
    }
}
