package za.ac.cput.school_management.service;

import org.apache.tomcat.jni.Address;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.domain.Country;
import za.ac.cput.school_management.factory.CityFactory;
import za.ac.cput.school_management.factory.CountryFactory;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {CityServiceImpl.class})
class CityServiceImplTest {
  private final  Country count = CountryFactory.build("7777","South Africa");
    private final City city = CityFactory.build("4455","East London",count);


    @Autowired  private CityServiceImpl service;
    @Test
    void save() {
        City saved = this.service.save(this.city);
        assertAll(
                () -> assertNotNull(saved), () -> assertEquals(this.city, saved));
    }

    @Test
    void read() {
        Optional<City> read = this.service.read(this.city.getId());
        System.out.println(read);
        assertAll(() -> assertTrue(read.isPresent()), () -> assertSame(this.city, read.get()));
    }

    @Test
    void findByCountry_IdOrderByName(String countryId) {
        this.service.findByCountry_IdOrderByName(countryId);
        assertSame(this.city.getCountry().getId(),countryId);
    }

    @Test
    void delete() {
        this.service.delete(this.city);
        List<City> cityList = this.service.findAll();
        assertSame(0, cityList.size());
    }
    @Test
    void findAllStudentId() {
        String Id = this.city.getId();
        List<City> cityList = this.service.findAll();
        assertSame(1 ,cityList.size());
    }
}