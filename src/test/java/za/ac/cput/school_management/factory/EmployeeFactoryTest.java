/*
 *Author:Chad Siegelaar 218340982
 *Employee Factory Test
 *11 June 2022
 */

package za.ac.cput.school_management.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.Employee;
import za.ac.cput.school_management.domain.Name;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {
    @Test
    public void buildWithSuccess() {
        Name name = new Name.Builder().setFirstName("Daniel").setMiddleName("Joey").setLastName("Smith").build();
        Employee employee = EmployeeFactory.build("011", "employee@inet.co.za", name);
        System.out.println(employee);
        assertNotNull(employee);
    }
    @Test
    public void  buildWithError() {
        Name name =  new Name.Builder().setFirstName("John").
                setMiddleName("").setLastName("Stewart").build();
     Exception exception = assertThrows(IllegalArgumentException.class,() ->
               EmployeeFactory.build(null, "johnnys@gmail.com", name));
        assertTrue(exception.getMessage().contains("Staff Id is needed"));

    }
}
