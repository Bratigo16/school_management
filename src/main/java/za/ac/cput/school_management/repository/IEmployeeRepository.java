package za.ac.cput.school_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.school_management.domain.Employee;

import java.util.List;

public interface IEmployeeRepository extends JpaRepository<Employee, String> {
    List<Employee> findall();

    Employee findByCity_IdOrderByName(String cityId);
}

