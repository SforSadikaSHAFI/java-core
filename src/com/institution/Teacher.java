package com.institution;

public class Teacher extends Employee{
    private String dept;
    Teacher(){

    }
    Teacher(String name,int age,String gender,String dept){
        super(name,age,gender);
        this.dept = dept;
    }

    @Override
    void goesToWashroom() {
       // if(super.gender == "Male"){
            System.out.println("Mr. "+ this.getName() +" is going to "+this.getGender()+" washroom for the teacher" );
//             //super.goesToWashroom();
//    }
//         else {
//             System.out.println("Ms. "+ super.name +" is going to "+super.gender+" washroom for the teacher" );
//         }

    }


}
