package com.institution;

public class GateKeeper extends Staff{
    GateKeeper(String name, int age, String gender , String reportingTime){
      super(name, age, gender, reportingTime);
    }
    public void opensGate(){
        System.out.println(getName()+" is opening the gate.");
    }
    public void closesGate(){
        System.out.println(getName()+" is closing the gate.");
    }

}
