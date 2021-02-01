package com.christien.googleguice.b_scopes;

public class MrLubeCarRepairService implements CarRepairService{

    private double repairTime;

    public MrLubeCarRepairService() {
        this.repairTime = Math.random() * 100;
    }

    @Override
    public void repair() {
        System.out.println("Repair Time:" + (repairTime * 10.0));
    }
}
