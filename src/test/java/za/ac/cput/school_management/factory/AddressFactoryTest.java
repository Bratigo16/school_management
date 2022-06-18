/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Repository :Address Factory Test
 */
package za.ac.cput.school_management.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.Address;
import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.domain.factory.AddressFactory;


import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {
    @Test
    public void buildWithSuccess(){
        City city = new City.Builder().setId("220001499").setName("Cape Town").build();

        Address address = AddressFactory.build("22","Cape Town Village Complex","44","Goodwood Street",7405,city);
        System.out.println(address);
        assertNotNull(address);
    }

    @Test
    public void  buildWithError() {
        Exception exception;
        exception = assertThrows(IllegalArgumentException.class,() ->
                AddressFactory.build(null,"Cape Town Village Complex","Carter","Goodwood Street",7405, null));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Unit Number is required",exceptionMessage);
    }

}
