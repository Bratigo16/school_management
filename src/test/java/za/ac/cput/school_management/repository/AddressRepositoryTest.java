/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Repository :Address repository Test
 */
package za.ac.cput.school_management.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.Address;
import za.ac.cput.school_management.domain.StudentAddress;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class AddressRepositoryTest {
    private Address address;
    @Autowired
    private  AddressRepository repository;


    @Test
    @Order(1)
    void save() {
        Address saved =this.repository.save(this.address);
        assertNotNull(saved);
        assertSame(this.address,saved);
    }

    @Test
    @Order(2)
    void read() {
        Optional<Address> read =this.repository.read(this.address.getUnitNumber());
        assertAll(
                ()->assertTrue(read.isPresent()),
                ()-> assertSame(this.address,read.get())
        );
    }

    @Test
    @Order(3)
    void delete() {
        this.repository.save(this.address);
        List<Address> AddressList= this.repository.findAll();
        assertEquals(0,AddressList.size());
    }

    @Test
    @Order(4)
    void findAll() {
        List<Address>AddressList= this.repository.findAll();
        assertEquals(1,AddressList.size());
    }
}