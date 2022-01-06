package com.institution;

public class Employee {
 private String name, gender;
 private int age;
 Employee(){

 }
 Employee(String name, int age, String gender){
     this.name = name;
     this.age = age;
     this.gender = gender;
 }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    void goesToWashroom(){
        System.out.println("Mr. "+ name +" is going to "+gender+" washroom" );
    }
}
