package com.christien.objectoriented.abstractionandencapsulation;

public abstract class Employee {

    private int id;
    private String name;
    private String address;

    protected int emplyeeDiscount = 50;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public abstract void stateJobTitle();

    public double computePay(){
        System.out.println("PAY IS: $14.00/hr");
        return 14.00/1.2;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
