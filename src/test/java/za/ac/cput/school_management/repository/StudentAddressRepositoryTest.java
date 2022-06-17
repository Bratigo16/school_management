/*
 *Author:Tasneem Jacobs 215030389
 *Applications Development ADP3
 *Assignment School management
 *Repository Test :Student Address repository test
 */
package za.ac.cput.school_management.repository;

import org.apache.tomcat.jni.Address;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.StudentAddress;
import za.ac.cput.school_management.factory.StudentAddressFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StudentAddressRepositoryTest {
 private final StudentAddress studentAddress = StudentAddressFactory.build("test-Stu-id",new Address());
 @Autowired private  StudentAddressRepository repository;

    @Test
    @Order(1)
    void save() {
        StudentAddress saved =this.repository.save(this.studentAddress);
        assertNotNull(saved);
        assertSame(this.studentAddress,saved);
    }

    @Test
    @Order(2)
    void read() {
        Optional<StudentAddress> read =this.repository.read(this.studentAddress.getStudentId());
        assertAll(
                ()->assertTrue(read.isPresent()),
                ()-> assertEquals(this.studentAddress,read.get())
        );
    }
  @Order(3)
    @Test
    void delete() {
        this.repository.save(this.studentAddress);
        List<StudentAddress> studentAddressList= this.repository.findAll();
        assertEquals(0,studentAddressList.size());
    }

    @Test
    @Order(4)
    void findAll() {
        List<StudentAddress>studentAddressList= this.repository.findAll();
        assertEquals(1,studentAddressList.size());
    }
}