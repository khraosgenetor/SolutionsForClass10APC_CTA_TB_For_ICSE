package _7_Constructors;

import java.util.Scanner;

class Student {
    int mm, scm, comp;
    String name, eligibleCourse;

    Student(String str, int math, int science, int compsc) {
        name = str;
        mm = math;
        scm = science;
        comp = compsc;
    }

    void check() {
        int avg = (mm + scm + comp) / 3;
        if (mm >= 90 && scm >= 90 && comp >= 90)
            eligibleCourse = "Science with Computer";
        else if (avg >= 90)
            eligibleCourse = "Bio-Science";
        else if (avg >= 80)
            eligibleCourse = "Science with Hindi";
        else
            eligibleCourse = "Not eligible for any course";
    }

    void display() {
        System.out.println("The student (" + name + ") is eligible for: " + eligibleCourse);
    }
}

public class bit6question10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of student: ");
        String name = in.nextLine();
        System.out.print("Enter Math marks: ");
        int mm = in.nextInt();
        System.out.print("Enter Science marks: ");
        int scm = in.nextInt();
        System.out.print("Enter CompSc. marks: ");
        int comp = in.nextInt();

        Student stud = new Student(name, mm, scm, comp);
        stud.check();
        stud.display();
    }
}