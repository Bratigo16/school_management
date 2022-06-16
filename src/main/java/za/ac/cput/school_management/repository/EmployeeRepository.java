/*
 *Author:Chad Siegelaar 218340982
 *Employee Repository
 *13 June 2022
 */

package za.ac.cput.school_management.repository;


import za.ac.cput.school_management.domain.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeRepository {
    private final List<Employee> employeeList;
    private static  EmployeeRepository EMPLOYEE_REPOSITORY;

    private EmployeeRepository() {
        this.employeeList = new ArrayList<>();
    }
    public  static  EmployeeRepository GetEmployeeRepository () {
        if (EMPLOYEE_REPOSITORY == null)
            EMPLOYEE_REPOSITORY = new EmployeeRepository();
        return  EMPLOYEE_REPOSITORY;
    }

    public Employee save (Employee Employee) {
        Optional<Employee> read = read(Employee.getStaffId());
        if (read.isPresent()){
            delete(read.get());
        }
        this.employeeList.add(Employee);
        return Employee;
    }

    public  Optional<Employee> read (String staffId){
        return this.employeeList.stream().filter(g -> g.getStaffId().equalsIgnoreCase(staffId)).findFirst();
    }

    public void delete (Employee employee){
        this.employeeList.remove(employee);
    }
    public List<Employee> findAll() {
        return this.employeeList;
    }
}
