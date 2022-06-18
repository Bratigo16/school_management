package za.ac.cput.school_management.factory;
/*
 *  Author: Brady Sheldon 219053715
 *  Student
 *  June Assignment
 *
 * */

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.Student;


import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {

    @Test
    void buildWithError(){
        Exception exception = assertThrows(IllegalAccessException.class,() ->
                StudentFactory.build("219067988",
                        "219067988@mycput.ac.za",
                        "Frank",
                        "Overrated",
                        "Lampard"));
        System.out.println(exception.getMessage());
        assertTrue(exception.getMessage().contains("StudentID"));
    }

    @Test
    void buildWithSuccess(){
        Student student = StudentFactory
                .build("219067988",
                        "219067988@mycput.ac.za",
                        "Thierry",
                        "Goat",
                        "Henry");
        System.out.println(student);
        assertAll(
                () -> assertNotNull(student)
        );
    }
}