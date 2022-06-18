/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Service :Address Service Impl Test
 */
package za.ac.cput.school_management.service;

import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.Address;
import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.factory.AddressFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class AddressServiceImplTest {
    @Mock
    private Address addressRepository;

    @InjectMocks
    private AddressServiceImpl SERVICE;

    @BeforeEach
    void setUp() {
        City city = new City.Builder().setId("220001499").setName("Cape Town").build();
        this.addressRepository = AddressFactory.build(
                "2",
                "abc complex",
                "22",
                "abd Street",
                7405,city);

        this.SERVICE = AddressServiceImpl.getService();


    }

    @AfterEach
    void tearDown() {
        this.SERVICE.delete(this.addressRepository);
    }

    @Test
    @Order(1)
    void save() {
        Address saved = this.SERVICE.save(this.addressRepository);
        assertNotNull(saved);
        assertSame(this.addressRepository, saved);
    }

    @Test
    @Order(2)
    void read() {
        Address saved = this.SERVICE.save(this.addressRepository);
        Optional<Address> read = this.SERVICE.read(saved.getUnitNumber());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () ->assertSame(saved,read.get())

        );
    }

    @Test
    @Order(3)
    void delete() {
        Address saved = this.SERVICE.save(this.addressRepository);
        List<Address> AddressList= this.SERVICE.findAll();
        assertEquals(1, AddressList.size());
        this.SERVICE.delete(saved);
        AddressList= this.SERVICE.findAll();
        assertEquals(0,AddressList.size());
    }

    @Test
    @Order(4)
    void findAll() {this.SERVICE.save(this.addressRepository);
        List<Address> AddressList= this.SERVICE.findAll();
        assertEquals(1,AddressList.size());
    }
}