package com.company;

public class Main {

    public static void main(String[] args) {
        //  System.out.println("I love you ..thank you so much for everything.");
	// write your code here
      /*  Employee emp1 =  new Employee();

        emp1.name = "Sadika Hasnat";
        emp1.age = 21;
        System.out.println("Name: "+ emp1.name);
        System.out.println("Name: "+ emp1.age);
         */

        Teacher t1 = new Teacher("Hasnat", 25, "Male","CSE");
        t1.goesToWashroom();

        Staff s1 = new Staff("X",26,"Male","10");
        s1.goesToWashroom();

    }
}
