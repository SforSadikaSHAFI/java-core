package com.institution;


import com.finalInstitute.*;
import com.finalInstitute.GateKeeper;
import com.finalInstitute.MathTeacher;
import com.finalInstitute.ScienceTeacher;
import com.finalInstitute.Staff;
import com.finalInstitute.Teacher;
import com.sun.source.doctree.BlockTagTree;
//import com.institute.*;
//import com.institute.MathTeacher;
//import com.institute.ScienceTeacher;
//import com.institute.Staff;
//import com.institute.Teacher;
//import com.finalInstitute.Employee;
//import com.finalInstitute.Teacher;


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

//        Employee employee1 = new Employee();
//        //task 1
//        Teacher teacher1 = new Teacher("Hasnat", 25, "Male","CSE");
//        teacher1.goesToWashroom();
//        //task 2
//        Staff satff1 = new Staff("X",26,"Male","10");
//        satff1.goesToWashroom();
//
//         //task 3
//        GateKeeper gateKeeper1 = new GateKeeper("X",26,"Male","10");
//        gateKeeper1.closesGate();
//        gateKeeper1.opensGate();
//        //task 4
//        Peon peon1 = new Peon("Y",25,"Male","10");
//        peon1.makesTea();
//        peon1.postLetters();
//
////        7. A teacher may only teach math
////        8. A math teacher needs to teach geometry and algebra
////        //task 7 & 8
//        MathTeacher mathTeacher1 = new MathTeacher("Hasnat", 25, "Male","Math");
//        mathTeacher1.teachesAlgebra();
//        mathTeacher1.teachesGeometry();
//
////        9. A teacher may only teach science
////        10. A science teacher needs to teach physics and chemistry
//        ScienceTeacher scienceTeacher1 = new ScienceTeacher("Waliul", 27, "Male","Science");
//        scienceTeacher1.teachesPhysics();
//        scienceTeacher1.teachesChemistry();
//
////        11. At times, a science teacher might have to teach math as well
//
////        scienceTeacher1.teachesAlgebra();
////        scienceTeacher1.teachesGeometry();
//
//        // 12. All teachers take exam
//        //13. Teachers may take exam in quiz format
//
//        //task 12
//        scienceTeacher1.takeExam();
//        mathTeacher1.takeExam();
//
//        //task 13
//        scienceTeacher1.takeQuiz();
//        mathTeacher1.takeQuiz();


//        Teacher teacher = new Teacher("James", 30, Gender.Male, Department.Science);
//        teacher.goToWashroom();

//        Staff staff = new Staff("Jason", 27, Gender.Male, 830);
//        staff.goToWashroom();
//
//        GatekeeperStaff gatekeeperStaff = new GatekeeperStaff("Walter",35,Gender.Male,930);
//        gatekeeperStaff.goToWashroom();
//        gatekeeperStaff.openGate();
//        gatekeeperStaff.closeGate();
//
//        PeonStaff peonStaff = new PeonStaff("John",28,Gender.Male,800);
//        peonStaff.makeTea();
//        peonStaff.postLetter();
//        peonStaff.goToWashroom();
//
//        MathTeacher mathTeacher = new MathTeacher("Robert", 34, Gender.Male, Department.Science);
//        mathTeacher.goToWashroom();
//        mathTeacher.teachAlgebra();
//        mathTeacher.teachGeometry();
//        mathTeacher.takeExam();
//        mathTeacher.takeExam(true);
//        mathTeacher.takeExam(false);
//
//        ScienceTeacher sciTeacher = new ScienceTeacher("Rebeca", 27, Gender.Female, Department.Science);
//        sciTeacher.goToWashroom();
//        sciTeacher.teachesPhysics();
//        sciTeacher.teachesChemistry();
//        sciTeacher.teachAlgebra();
//        sciTeacher.teachGeometry();
//        sciTeacher.takeExam();
//        sciTeacher.takeExam(true);
//        sciTeacher.takeExam(false);



        /*
         * Encapsulation
         * Abstraction
         * Inheritance
         * Polymorphism
         * */

        // return the larger integer

////        System.out.println(exmple());
//        Problem prob = new Problem();
//        System.out.println(prob.example(5,6).toString());

        //Final project

//        Teacher teacher = new Teacher("Albert",27,Gender.Male,Department.Science);
//        teacher.goToWashroom();

        Staff staff = new Staff("Robert", 26, Gender.Male, 890);
        staff.goToWashroom();

        GateKeeperStaff gateKeeper = new GateKeeperStaff("Alison", 24, Gender.Male, 900);
        gateKeeper.goToWashroom();
        gateKeeper.openGate();
        gateKeeper.closeGate();

        PeonStaff peonStaff = new PeonStaff("John", 26, Gender.Male, 915);
        peonStaff.goToWashroom();
        peonStaff.makeTea();
        peonStaff.postLetter();

        MathTeacher mathTeacher = new MathTeacher("Jack", 32, Gender.Male, Department.Science);
        mathTeacher.goToWashroom();
        mathTeacher.teachAlgebra();
        mathTeacher.teachGeometry();
        mathTeacher.takeExam();
        mathTeacher.takeExam(true);
        mathTeacher.takeExam(false);

        ScienceTeacher scienceTeacher = new ScienceTeacher("Rob", 35, Gender.Male, Department.Science);
        scienceTeacher.goToWashroom();
        scienceTeacher.teachChemistry();
        scienceTeacher.teachPhysics();
        scienceTeacher.teachAlgebra();
        scienceTeacher.teachGeometry();
        scienceTeacher.takeExam();
        scienceTeacher.takeExam(true);
        scienceTeacher.takeExam(false);

    }
}
