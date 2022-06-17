/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Repository : Employee Address Repository Test
 */
package za.ac.cput.school_management.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.EmployeeAddress;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressRepositoryTest {
    private EmployeeAddress employeeAddress;
    private  EmployeeAddressRepository repository;

    @Test
    void save() {
        EmployeeAddress saved =this.repository.save(this.employeeAddress);
        assertNotNull(saved);
        assertSame(this.employeeAddress,saved);
    }

    @Test
    void read() {
        Optional<EmployeeAddress> read =this.repository.read(this.employeeAddress.getstaffId());
        assertAll(
                ()->assertTrue(read.isPresent()),
                ()-> assertSame(this.employeeAddress,read.get())
        );
    }

    @Test
    void delete() {
        EmployeeAddress saved = this.repository.save(this.employeeAddress);
        List<EmployeeAddress> EmployeeAddressList= this.repository.findAll();
        assertEquals(1,EmployeeAddressList.size());
        this.repository.delete(saved);
        EmployeeAddressList= this.repository.findAll();
        assertEquals(0,EmployeeAddressList.size());
    }

    @Test
    void findAll() {
        List<EmployeeAddress>EmployeeAddressList= this.repository.findAll();
        assertEquals(1,EmployeeAddressList.size());
    }
}