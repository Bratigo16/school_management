/*  CountryServiceTest.java
    Class to test the Country Service
    Author: Wilbur Deano Smith (220003033)
    Date: 17 June 2022
*/
package za.ac.cput.school_management.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.school_management.domain.Country;
import za.ac.cput.school_management.factory.CountryFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CountryServiceTest {

    private final Country country = CountryFactory
            .build("test-id",
                    "test-name");

    @Autowired
    private CountryService service;

    @Order(1)
    @Test
    void save()
    {
        Country saved = this.service.save(this.country);
        assertAll(
                () -> assertNotNull(saved),
                () -> assertEquals(this.country, saved)
        );
    }

    @Order(2)
    @Test
    void read() {
        Optional<Country> read = this.service.read(this.country.getId());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(this.country, read.get())
        );
    }

    @Order(4)
    @Test
    void delete() {
        this.service.delete(this.country);
    }

    @Order(3)
    @Test
    void findAll() {
        List<Country> countryList = this.service.findAll();
        assertSame(0, countryList);
    }
}