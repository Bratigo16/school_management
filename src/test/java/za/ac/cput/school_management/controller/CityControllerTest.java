package za.ac.cput.school_management.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.domain.Country;
import za.ac.cput.school_management.factory.CityFactory;
import za.ac.cput.school_management.factory.CountryFactory;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CityControllerTest {
@Autowired  private CityController controller;
private City city;
private Country count;


@BeforeEach
void setUp(){
assertNotNull(controller);
this.count = CountryFactory.build("565","Germany");
this.city = CityFactory.build("454","Liepzig",count);

}
    @Test
    void save() {

    }

    @Test
    void read() {
    }

    @Test
    void findByCountry_IdOrderByName() {
    }

    @Test
    void delete() {
    }

    @Test
    void findAll() {
    }
}