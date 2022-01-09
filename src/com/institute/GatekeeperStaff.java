package com.institute;

public class GatekeeperStaff extends Staff implements  Gatekeeper{

    public GatekeeperStaff(String name, int age, Gender gender, int reportingTime) {
        super(name, age, gender, reportingTime);
    }

    @Override
    public void openGate() {
        System.out.println(String.format("Mr. %s opens Gate", getName()));

    }

    @Override
    public void closeGate() {
        System.out.println(String.format("Mr. %s closes Gate", getName()));

    }
}
