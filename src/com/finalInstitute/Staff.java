package com.finalInstitute;

public class Staff extends Employee {
    private int reportingTime;

    public Staff(String name, int age, Gender gender, int reportingTime) {
        super(name, age, gender);
        this.reportingTime = reportingTime;
    }

    public int getReportingTime() {
        return reportingTime;
    }

    @Override
    public void goToWashroom() {
        if (getGender().name() == "Male") {
            System.out.println(String.format("Mr. %s is going to %s washroom for the staffs.", getName(), getGender().name()));
        } else
            System.out.println(String.format("Ms. %s is going to %s washroom for the staffs.", getName(), getGender().name()));
    }
}
