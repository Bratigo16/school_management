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
public abstract class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

   private static EmployeeService employeeService;

    public EmployeeServiceImpl() {
        this.employeeRepository = EmployeeRepository.GetEmployeeRepository();
    }

    public static EmployeeServiceImpl getEmployeeService() {
        if(employeeService == null)
            employeeService = employeeService;
        return (EmployeeServiceImpl)  employeeService;
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
    public Employee reading(Employee employee) {
        return null;
    }

    @Override
    public void delete(Employee employee) {
        this.employeeRepository.delete(employee);
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee findByCountry_IdOrderByName(String cityId) {
        return this.employeeRepository.findByCity_IdOrderByName(cityId);
    }
}
