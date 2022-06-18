package za.ac.cput.school_management.service;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.school_management.domain.Employee;
import java.util.List;
import java.util.Optional;

public interface EmployeeService extends JpaRepository<Employee, String> {
    Optional<Employee> read(String staffId);

    Employee reading(Employee employee);

    List<Employee> findAll();

    Employee findByCity_IdOrderByName(String cityId);

    Employee findByCountry_IdOrderByName(String cityId);
}
