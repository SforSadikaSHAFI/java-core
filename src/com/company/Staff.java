package com.company;

public class Staff extends Employee{
    String reportingTime;

    Staff(String name , int age, String gender, String reportingTime){
        super(name,age,gender);
        this. reportingTime = reportingTime;

    }

    @Override
    void goesToWashroom() {

//        if(super.gender == "Male"){
            System.out.println("Mr. "+ this.getName() +" is going to "+this.getGender()+" washroom for the staff" );
//            //super.goesToWashroom();
//        }
//        else {
//            System.out.println("Ms. "+ super.name +" is going to "+super.gender+" washroom for the staff" );
//        }
//    }
    }
}
