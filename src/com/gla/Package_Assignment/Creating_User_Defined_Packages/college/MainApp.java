package com.gla.Package_Assignment.Creating_User_Defined_Packages.college;
import com.gla.Package_Assignment.Creating_User_Defined_Packages.college.student.Student;
import com.gla.Package_Assignment.Creating_User_Defined_Packages.college.faculty.Faculty;
public class MainApp {
    public static void main(String[] args) {
        Student s = new Student();
        Faculty f = new Faculty();

        s.display();
        f.display();
    }
}
