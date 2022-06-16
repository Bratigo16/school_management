/*
 *Author:Chad Siegelaar 218340982
 *Employee Service
 *15 June 2022
 */

package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.Employee;
import za.ac.cput.school_management.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static EmployeeService employeeService= null;
    private EmployeeRepository employeeRepository;
    private EmployeeServiceImpl() {
        this.employeeRepository = EmployeeRepository.GetEmployeeRepository();
    }

    public static EmployeeService getEmployeeService(){
        if (employeeService == null) employeeService = (EmployeeService) new EmployeeServiceImpl();
        return  employeeService;
    }

    @Override
    public Employee save(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> read(String staffId) {
        return this.employeeRepository.read(staffId);
    }

    @Override
    public void delete(Employee employee) {
        this.employeeRepository.delete(employee);
    }

    @Override
    public List<EmployeeService> findAllStaffId (String staffId) {
        return null;
    }
}
