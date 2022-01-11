package com.finalInstitute;

public class GateKeeperStaff extends Staff implements GateKeeper{


    public GateKeeperStaff(String name, int age, Gender gender, int reportingTime) {
        super(name, age, gender, reportingTime);
    }

    @Override
    public void openGate() {
        System.out.println(String.format("Mr. %s is opening the gate",getName()));
    }

    @Override
    public void closeGate() {
        System.out.println(String.format("Mr. %s is closing the gate",getName()));
    }
}
