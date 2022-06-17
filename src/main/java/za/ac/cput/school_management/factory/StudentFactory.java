package za.ac.cput.school_management.factory;

import za.ac.cput.school_management.domain.Student;


/*
 *  Author: Brady Sheldon 219053715
 *  Student
 *  June Assignment
 *
 * */
public class StudentFactory {

    public static Student build(String StudentID, String StudentEmail, String FirstName, String MiddleName, String LastName) {

        return new Student.builder()
                .StudentID(StudentID)
                .StudentEmail(StudentEmail)
                .FirstName(FirstName)
                .MiddleName(MiddleName)
                .LastName(LastName)
                .build();
    }



}