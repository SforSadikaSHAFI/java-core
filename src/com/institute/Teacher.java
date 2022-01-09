package com.institute;

public abstract class Teacher extends Employee {
    private Department dept;

    public Teacher(String name, int age, Gender gender, Department dept) {
        super(name, age, gender);
        this.dept = dept;
    }


    @Override
    public void goToWashroom() {
        System.out.println(String.format("Mr. %s is going to %s washroom for Teachers", getName(), getGender().name()));
    }

    public abstract void takeExam();
    public abstract void takeExam(Boolean isQuiz);

}