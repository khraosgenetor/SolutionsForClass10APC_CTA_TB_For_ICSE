package Constructors;

import java.util.Scanner;

class Student {
    int mm, scm, comp;
    String name, eligibleCourse;
    Student(String str, int math, int science, int compsc) {
        name = str;
        eligibleCourse = null;
        mm = math;
        scm = science;
        comp = compsc;
    }

    void check() {
        if( mm >= 90 && scm >= 90 && comp >= 90) {
            eligibleCourse = "Science with Computer";
        } else if (((mm + scm + comp)/3) >= 90 ) {
            eligibleCourse = "Bio-Science";
        } else if (((mm + scm + comp)/3) >= 80 && ((mm + scm + comp)/3) < 90) {
            eligibleCourse = "Science with Hindi";
        } else {
            eligibleCourse = "Not eligible for any course";
        }
    }

    void display () {
        System.out.println("The student ("+name+") is eligible for the following course: "+eligibleCourse);
    }
}

public class bit6question10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int mm, scm, comp;
        System.out.print("Enter the name of student: ");
        name = in.nextLine();
        System.out.print("Enter the Math marks of student: ");
        mm = in.nextInt();
        System.out.print("Enter the Science marks of student: ");
        scm = in.nextInt();
        System.out.print("Enter the CompSc. marks of student: ");
        comp = in.nextInt();
        Student stud = new Student(name, mm, scm, comp);
        stud.check();
        stud.display();
    }
}