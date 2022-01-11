package com.finalInstitute;

public class ScienceTeacher extends Teacher implements Science,Math{

    public ScienceTeacher(String name, int age, Gender gender, Department dept) {
        super(name, age, gender, dept);
    }

    @Override
    public void teachPhysics() {
        System.out.println(String.format("Mr. %s is teaching Physics",getName()));
    }

    @Override
    public void teachChemistry() {
        System.out.println(String.format("Mr. %s is teaching Chemistry",getName()));
    }

    @Override
    public void teachAlgebra() {
        System.out.println(String.format("Mr. %s is teaching Algebra in online",getName()));
    }

    @Override
    public void teachGeometry() {
        System.out.println(String.format("Mr. %s is teaching Algebra in online",getName()));
    }

    @Override
    public void takeExam() {
        System.out.println(String.format("Mr. %s is taking exam",getName()));
    }

    @Override
    public void takeExam(boolean isQuiz) {
       if(isQuiz) {
           System.out.println(String.format("Mr. %s is taking exam as quiz",getName()));
       }
       else takeExam();
    }
}
