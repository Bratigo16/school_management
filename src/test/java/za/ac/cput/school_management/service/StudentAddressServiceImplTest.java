/*
 *Author:Tasneem Jacobs 215030389
 *Applications Development ADP3
 *Assignment School management
 *Service Test :Student Address service Impl Test
 */
package za.ac.cput.school_management.service;

import org.apache.tomcat.jni.Address;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.StudentAddress;
import za.ac.cput.school_management.factory.StudentAddressFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = StudentAddressServiceImpl.class)
public class StudentAddressServiceImplTest {


    private Address address;
    private final StudentAddress studentAddress = StudentAddressFactory
            .build("test-stu-number",address);

 @Autowired
 private StudentAddressService service;
    @Test
    void save() {
        StudentAddress saved = this.service.save(this.studentAddress);
        assertAll(
                () -> assertNotNull(saved),
                () -> assertEquals(this.studentAddress, saved)
        );
    }

    @Test
    void read() {
        Optional<StudentAddress> read = this.service.read(this.studentAddress.getStudentId());
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(this.studentAddress, read.get())
        );
    }


    @Test
    void delete() {
        this.service.delete(this.studentAddress);
    }

    @Test

    void findAllStudentId() {
        String studentId = this.studentAddress.getStudentId();
        List<StudentAddress> studentAddressList
                = this.service.findAllStudentId(studentId);
        System.out.println(studentAddressList);
        assertSame(0 ,studentAddressList.size());
    }
}