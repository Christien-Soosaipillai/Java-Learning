package com.christien.basics.variabletypes;

public class Employee {

    private static int EMPLOYEE_COUNT = 0;

    private int id;
    private String name;
    private String description;

    public Employee(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        EMPLOYEE_COUNT++;
    }

    public static int getEmployeeCount(){
        return EMPLOYEE_COUNT;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
