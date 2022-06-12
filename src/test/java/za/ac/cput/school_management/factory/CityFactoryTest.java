package za.ac.cput.school_management.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.domain.Country;

import static org.junit.jupiter.api.Assertions.*;

class CityFactoryTest {

    @Test public void buildpass(){
        Country country = new Country.Builder().setId("020227").setName("South Africa").build();

     City city =   CityFactory.build("220001499","Cape Town",country);
        System.out.println(city);
        assertNotNull(city);
    }
    //Filing test when country is null or empty
    @Test public void buildfail(){
        Country country = new Country.Builder().setId("").setName("").build();
        City city =   CityFactory.build("0404","Cape ",country);
        System.out.println(city);
        assertNotNull(city);
    }
    //Passing test built with errors
    @Test public void buildwithErrors(){
        Country country = new Country.Builder().setId("020227").setName("South Africa").build();

        Exception exception;
        exception = assertThrows(IllegalArgumentException.class,() ->

                CityFactory.build("5201",null,country));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Name is required",exceptionMessage);
    }
}