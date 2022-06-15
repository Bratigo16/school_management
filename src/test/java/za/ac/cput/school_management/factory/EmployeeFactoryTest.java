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
        Employee employee = EmployeeFactory.build("011", "employee@inet.co.za", "Jackie Gwen");
        System.out.println(employee);
        assertNotNull(employee);
    }
    @Test
    public void  buildWithError() {
     Exception exception = assertThrows(IllegalArgumentException.class,() ->
               EmployeeFactory.build(null, "Daniel Smith", new Name));
        assertTrue(exception.getMessage().contains("Staff Id is needed"));

    }
}
