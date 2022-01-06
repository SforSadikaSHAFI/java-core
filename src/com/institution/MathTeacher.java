package com.institution;

public class MathTeacher extends Teacher {

MathTeacher(String name,int age,String gender,String dept){
    super(name, age, gender, dept);
    //super.teachesMath();
}

void teachesAlgebra(){
    System.out.println(getName()+" teaches Algebra.");
}
    void teachesGeometry(){
        System.out.println(getName()+" teaches Geometry.");
    }


}
