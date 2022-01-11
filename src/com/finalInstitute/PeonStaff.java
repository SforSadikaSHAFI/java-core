package com.finalInstitute;

public class PeonStaff extends Staff implements Peon{

    public PeonStaff(String name, int age, Gender gender, int reportingTime) {
        super(name, age, gender, reportingTime);
    }

    @Override
    public void makeTea() {
        System.out.println(String.format("Mr. %s is making tea",getName()));
    }

    @Override
    public void postLetter() {
        System.out.println(String.format("Mr. %s is posting letter",getName()));
    }
}
