package com.institution;

public class ScienceTeacher extends Teacher{
    ScienceTeacher(String name,int age,String gender,String dept){
        super(name, age, gender, dept);
        //super.teachesMath();
    }

    void teachesPhysics(){
        System.out.println(getName()+" teaches physics.");
    }
    void teachesChemistry(){
        System.out.println(getName()+" teaches chemistry.");
    }

}
