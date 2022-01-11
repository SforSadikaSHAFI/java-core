package com.finalInstitute;

public class Teacher extends Employee {

    private Department dept;

    public Teacher(String name, int age, Gender gender, Department dept) {
        super(name, age, gender);
        this.dept = dept;
    }

    @Override
    void goToWashroom() {
        System.out.println(String.format("Mr. %s is going to %s washroom for the teachers. ",getName(),getGender().name()));
    }
}
