/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Repository :Address repository Test
 */
package za.ac.cput.school_management.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.Address;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class AddressRepositoryTest {
    private Address Address;
    private  AddressRepository repository;


    @Test
    void save() {
        Address saved =this.repository.save(this.Address);
        assertNotNull(saved);
        assertSame(this.Address,saved);
    }

    @Test
    void read() {
        Optional<Address> read =this.repository.read(this.Address.getUnitNumber());
        assertAll(
                ()->assertTrue(read.isPresent()),
                ()-> assertSame(this.Address,read.get())
        );
    }

    @Test
    void delete() {
       Address saved = this.repository.save(this.Address);
        List<Address> AddressList= this.repository.findAll();
        assertEquals(1,AddressList.size());
        this.repository.delete(saved);
        AddressList= this.repository.findAll();
        assertEquals(0,AddressList.size());
    }

    @Test
    void findAll() {
        List<Address>AddressList= this.repository.findAll();
        assertEquals(1,AddressList.size());
    }
}