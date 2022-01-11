package com.finalInstitute;

public class MathTeacher extends Teacher implements Math{

    public MathTeacher(String name, int age, Gender gender, Department dept) {
        super(name, age, gender, dept);
    }

    @Override
    public void teachAlgebra() {
        System.out.println(String.format("Mr. %s is teaching Algebra",getName()));
    }

    @Override
    public void teachGeometry() {
        System.out.println(String.format("Mr. %s is teaching Geometry",getName()));
    }

    @Override
    public void takeExam() {
        System.out.println(String.format("Mr. %s is taking exam",getName()));
    }

    @Override
    public void takeExam(boolean isQuiz) {

       if(isQuiz){
           System.out.println(String.format("Mr. %s is taking exam as quiz",getName()));
       }
       else takeExam();
    }
}
