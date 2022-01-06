package com.institution;


//import com.company.PracticeMethods;

//import java.util.Scanner;

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

       /* Teacher t1 = new Teacher("Hasnat", 25, "Male","CSE");
        t1.goesToWashroom();

        Staff s1 = new Staff("X",26,"Male","10");
        s1.goesToWashroom();
        */
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter 1st number :");
//        int a = input.nextInt();
//        System.out.print("Enter 2nd number :");
//        int b = input.nextInt();
//        System.out.print("Enter 3rd number :");
//        int c = input.nextInt();
//        //input.Max(a,b,c);
//        PracticeMethods p1 = new PracticeMethods(a,b,c);
//        p1.Max();
//        p1.Min();
        //5. A stuff can be a gatekeeper that opens and closes gate.
        //6. A stuff can be a peon that makes tea, post letters.

        Employee employee1 = new Employee();
        //task 1
        Teacher teacher1 = new Teacher("Hasnat", 25, "Male","CSE");
        teacher1.goesToWashroom();
        //task 2
        Staff satff1 = new Staff("X",26,"Male","10");
        satff1.goesToWashroom();

         //task 3
        GateKeeper gateKeeper1 = new GateKeeper("X",26,"Male","10");
        gateKeeper1.closesGate();
        gateKeeper1.opensGate();
        //task 4
        Peon peon1 = new Peon("Y",25,"Male","10");
        peon1.makesTea();
        peon1.postLetters();

//        7. A teacher may only teach math
//        8. A math teacher needs to teach geometry and algebra
        //task 7
        MathTeacher mathTeacher1 = new MathTeacher("Hasnat", 25, "Male","Math");
        

    }
}
