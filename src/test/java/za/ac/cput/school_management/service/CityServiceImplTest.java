package za.ac.cput.school_management.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.domain.Country;
import za.ac.cput.school_management.factory.CityFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CityServiceImplTest {
private City city;
private CityServiceImpl Service;
@BeforeEach
//Save
void setup(){
    Country country = new Country.Builder().setName("test-countryName").setId("test-countryId").build();
    this.city = CityFactory.build("test-id","test-name",country);
    this.Service = CityServiceImpl.GetCityService();
    City saved = this.Service.save(this.city);
    assertSame(this.city,saved);
}
@AfterEach
//Delete
void  teardown(){
    this.Service.delete(this.city);
    List<City> cityList = this.Service.findAll();
    assertEquals(0,cityList.size());
}

    @Test
    void read() {
        Optional<City> read = this.Service.read(this.city.getId());
        assertAll(()->assertTrue(read.isPresent()),()->assertSame(this.city,read.get()));
    }

    @Test
    void findAll() {
    List<City> cityList = this.Service.findAll();
    assertEquals(1,cityList.size());
    }
}