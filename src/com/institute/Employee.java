package com.institute;

public abstract class Employee {
    private String name;
    private int age;
    private Gender gender;

    public Employee(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public abstract void goToWashroom();
}
