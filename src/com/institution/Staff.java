package com.institution;

public class Staff extends Employee {
    String reportingTime;
    Staff(){

    }
    Staff(String name, int age, String gender , String reportingTime){
        super(name, age, gender);
        this.reportingTime = reportingTime;
    }
    Staff(String name){
        getName();
    }

    @Override
    void goesToWashroom() {
        //        if(super.gender == "Male"){
        System.out.println("Mr. "+ getName() +" is going to "+getGender()+" washroom for the staff" );
//            //super.goesToWashroom();
//        }
//        else {
//            System.out.println("Ms. "+ super.name +" is going to "+super.gender+" washroom for the staff" );
//        }
//    }
    }
}
