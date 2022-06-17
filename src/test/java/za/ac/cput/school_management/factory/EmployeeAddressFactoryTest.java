package za.ac.cput.school_management.factory;

import org.apache.tomcat.jni.Address;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.EmployeeAddress;


import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressFactoryTest {

    @Test
    public void buildWithSuccess() {

        EmployeeAddress employeeAddress = EmployeeAddressFactory.build("1234",new Address());
        System.out.println(employeeAddress);
        assertNotNull(employeeAddress);
    }

    @Test
    public void buildWithError() {

        Exception  exception = assertThrows(IllegalArgumentException.class,() ->
                EmployeeAddressFactory.build("null",new Address()));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame( "Staff id is required!",exceptionMessage );
    }

}