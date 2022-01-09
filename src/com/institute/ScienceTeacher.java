package com.institute;

public class ScienceTeacher extends Teacher implements Science, Math{
    public ScienceTeacher(String name, int age, Gender gender, Department dept) {
        super(name, age, gender, dept);
    }

    @Override
    public void takeExam() {
        System.out.println(String.format("Mr. %s is taking exam", getName()));
    }

    @Override
    public void takeExam(Boolean isQuiz) {
        if(isQuiz){
            System.out.println(String.format("Mr. %s is taking exam as quiz", getName()));
        }
        else
            takeExam();
    }

    @Override
    public void teachesPhysics() {
        System.out.println(String.format(" %s teaches Physics", getName()));

    }

    @Override
    public void teachesChemistry() {
        System.out.println(String.format(" %s teaches Chemistry", getName()));

    }

    @Override
    public void teachAlgebra() {
        System.out.println(String.format("Mr. %s teaches Algebra online", getName()));

    }

    @Override
    public void teachGeometry() {
        System.out.println(String.format("Mr. %s teaches Geometry online", getName()));

    }
}
