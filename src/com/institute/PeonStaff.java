package com.institute;

public class PeonStaff extends Staff implements Peon{
    public PeonStaff(String name, int age, Gender gender, int reportingTime) {
        super(name, age, gender, reportingTime);
    }

    @Override
    public void makeTea() {
        System.out.println(String.format("Mr. %s makes tea",getName()));
    }

    @Override
    public void postLetter() {
        System.out.println(String.format("Mr. %s posts letter",getName()));
    }
}
