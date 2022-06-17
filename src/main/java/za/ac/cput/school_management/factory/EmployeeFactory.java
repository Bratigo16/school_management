/*
 *Author:Chad Siegelaar 218340982
 *Employee Factory
 *11 June 2022
 */

package za.ac.cput.school_management.factory;

import za.ac.cput.school_management.domain.Employee;
import za.ac.cput.school_management.domain.Name;
import za.ac.cput.school_management.helper.StringHelper;

public class EmployeeFactory {
    public static Employee build(String staffId, String email, String name) {
        StringHelper.checkStringParam("staffId", staffId);
        StringHelper.checkStringParam("email", email);

        return new Employee.Builder()
                .email(email)
                .name(name)
                .staffId(staffId)
                .build();
    }
}
