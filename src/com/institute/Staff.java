package com.institute;

public class Staff extends Employee {
    private  int reportingTime;

    public Staff(String name, int age, Gender gender, int reportingTime) {
        super(name, age, gender);
        this.reportingTime = reportingTime;
    }

    @Override
    public void goToWashroom() {
        System.out.println(String.format("Mr. %s is going to %s washroom for Staff", getName(), getGender().name()));
    }
}
