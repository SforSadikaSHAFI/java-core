package com.institution;

public class MathTeacher extends Teacher implements IMath {

    MathTeacher(String name, int age, String gender, String dept) {
        super(name, age, gender, dept);
        //super.teachesMath();
    }

    public void teachesAlgebra() {

        System.out.println(getName() + " teaches Algebra.");
    }

    public void teachesGeometry() {
        System.out.println(getName() + " teaches Geometry.");
    }


}
