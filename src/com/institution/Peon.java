package com.institution;

public class Peon extends Staff {
    Peon(String name, int age, String gender , String reportingTime){
      super(name, age, gender, reportingTime);
    }
    public void makesTea(){
        System.out.println(getName()+" is making tea.");
    }
    public void postLetters(){
        System.out.println(getName()+" is posting letters.");
    }

}
