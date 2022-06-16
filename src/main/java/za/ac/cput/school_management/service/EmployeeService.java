package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.Employee;
import java.util.List;

public interface EmployeeService extends IService<Employee, String> {
    List<za.ac.cput.school_management.service.EmployeeService> findAllStaffId(String staffId);
}
