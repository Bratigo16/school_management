/*
 *Author:Tasneem Jacobs 215030389
 *Applications Development ADP3
 *Assignment School management
 *Factory :StudentAddressFactory Test
 */
package za.ac.cput.school_management.factory;
import org.apache.tomcat.jni.Address;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.StudentAddress;

import static org.junit.jupiter.api.Assertions.*;

class StudentAddressFactoryTest {
    @Test
    public void buildWithSuccess() {

        StudentAddress studentAddress = StudentAddressFactory
                .build("0125458",new Address());
        System.out.println(studentAddress);
        assertNotNull(studentAddress);
    }

    @Test
    public void buildWithError() {

        Exception  exception = assertThrows(IllegalArgumentException.class,() ->
                StudentAddressFactory
                        .build("null",new Address()));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame( "student id is required!",exceptionMessage );
    }

}
