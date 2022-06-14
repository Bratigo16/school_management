/*
 *Author:Tasneem Jacobs 215030389
 *Applications Development ADP3
 *Assignment School management
 *Repository Test :Student Address repository test
 */package za.ac.cput.school_management.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.StudentAddress;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


class StudentAddressRepositoryTest {
 private StudentAddress studentAddress;
 private  StudentAddressRepository repository;
    @Test
    void save() {
        StudentAddress saved =this.repository.save(this.studentAddress);
        assertNotNull(saved);
        assertSame(this.studentAddress,saved);
    }

    @Test
    void read() {
        Optional<StudentAddress> read =this.repository.read(this.studentAddress.getStudentId());
        assertAll(
                ()->assertTrue(read.isPresent()),
                ()-> assertSame(this.studentAddress,read.get())
        );
    }

    @Test
    void delete() {
       StudentAddress saved = this.repository.save(this.studentAddress);
        List<StudentAddress> studentAddressList= this.repository.findAll();
        assertEquals(1,studentAddressList.size());
        this.repository.delete(saved);
       studentAddressList= this.repository.findAll();
        assertEquals(0,studentAddressList.size());
    }

    @Test
    void findAll() {
        List<StudentAddress>studentAddressList= this.repository.findAll();
        assertEquals(1,studentAddressList.size());
    }
}