package com.company;

public class Employee {
 private String name;
 private int age;
 private String gender;
  Employee(String name, int age, String gender){
   this.name = name;
   this.age = age;
   this.gender = gender;
  }


 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public String getGender() {
  return gender;
 }

 public void setGender(String gender) {
  this.gender = gender;
 }

 void goesToWashroom(){
   System.out.println("Mr. "+ name +" is going to "+gender+" washroom" );
 }
}
