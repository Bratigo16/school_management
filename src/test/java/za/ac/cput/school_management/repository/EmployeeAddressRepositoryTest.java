/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Repository : Employee Address Repository Test
 */
package za.ac.cput.school_management.repository;

import org.apache.tomcat.jni.Address;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.EmployeeAddress;
import za.ac.cput.school_management.factory.EmployeeAddressFactory;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class EmployeeAddressRepositoryTest {
    private final EmployeeAddress employeeAddress = EmployeeAddressFactory.build("test-staff-id",new Address());
    @Autowired private  EmployeeAddressRepository repository;

    @Test
    @Order(1)
    void save() {
        EmployeeAddress saved =this.repository.save(this.employeeAddress);
        assertNotNull(saved);
        assertSame(this.employeeAddress,saved);
    }

    @Test
    @Order(2)
    void read() {
        Optional<EmployeeAddress> read =this.repository.read(this.employeeAddress.getstaffId());
        assertAll(
                ()->assertTrue(read.isPresent()),
                ()-> assertSame(this.employeeAddress,read.get())
        );
    }

    @Test
    @Order(3)
    void delete() {
        this.repository.save(this.employeeAddress);
        List<EmployeeAddress> employeeAddressList= this.repository.findAll();
        assertEquals(0,employeeAddressList.size());
    }

    @Test
    @Order(4)
    void findAll() {
        List<EmployeeAddress>EmployeeAddressList= this.repository.findAll();
        assertEquals(1,EmployeeAddressList.size());
    }
}