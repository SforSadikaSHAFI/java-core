package com.finalInstitute;

public abstract class Teacher extends Employee {

    private Department dept;

    public Teacher(String name, int age, Gender gender, Department dept) {
        super(name, age, gender);
        this.dept = dept;
    }

    @Override
    public void goToWashroom() {
        if(getGender().name()=="Male") {
            System.out.println(String.format("Mr. %s is going to %s washroom for the teachers. ", getName(), getGender().name()));
        }
        else  System.out.println(String.format("Ms. %s is going to %s washroom for the teachers. ", getName(), getGender().name()));
    }

    abstract void takeExam();
    abstract void takeExam(boolean isQuiz);
}
