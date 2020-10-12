package com.christien.objectoriented.abstractionandencapsulation;

public class Mechanic extends Employee {

    private double salary;

    public Mechanic(int id, String name, String address, double salary) {
        super(id, name, address);
        this.salary = salary;
    }

    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    @Override
    public void stateJobTitle() {
        System.out.println("I am a mechanic");
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary;
    }

}
