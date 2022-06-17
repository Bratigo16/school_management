package za.ac.cput.school_management.service;

/*
 *  Author: Brady Sheldon 219053715
 *  Student
 *  June Assignment
 *
 * */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import za.ac.cput.school_management.domain.Student;
import za.ac.cput.school_management.factory.StudentFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImpTest {


    @Mock
    private Student studentRepository;

    @InjectMocks
    private StudentServiceImp SERVICE;

    @BeforeEach
    void setUp() {
        this.studentRepository = StudentFactory.build(
                "2556678",
                "davidseaman@gmail.com",
                "David",
                "Arthur",
                "Seaman");

        this.SERVICE = StudentServiceImp.getService();


    }

    @AfterEach
    void tearDown() {
        this.SERVICE.delete(this.studentRepository);
    }

    @Test
    void save() {
        Student saved = this.SERVICE.save(this.studentRepository);
        assertNotNull(saved);
        assertSame(this.studentRepository, saved);
    }

    @Test
    void read() {
        Student saved = this.SERVICE.save(this.studentRepository);
        Optional<Student> read = this.SERVICE.read(saved.getStudentID());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () ->assertSame(saved,read.get())

        );
    }

    @Test
    void delete() {
        Student saved = this.SERVICE.save(this.studentRepository);
        List<Student> studentList= this.SERVICE.findAll();
        assertEquals(1, studentList.size());
        this.SERVICE.delete(saved);
        studentList= this.SERVICE.findAll();
        assertEquals(0,studentList.size());
    }

    @Test
    void findAll() {this.SERVICE.save(this.studentRepository);
        List<Student> studentList= this.SERVICE.findAll();
        assertEquals(1,studentList.size());
    }
}