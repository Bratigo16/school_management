/*
 *Author:Chad Siegelaar 218340982
 *EmployeeImpl Service Test
 *16 June 2022
 */

package za.ac.cput.school_management.service;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.domain.Country;
import za.ac.cput.school_management.domain.Employee;
import za.ac.cput.school_management.domain.Name;
import za.ac.cput.school_management.factory.CityFactory;
import za.ac.cput.school_management.factory.EmployeeFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {EmployeeServiceImpl.class})
public class EmployeeServiceImplTest {
    Name name = new Name.Builder().setFirstName("Sasha").setMiddleName("Jane").setLastName("Sylvester").build();
    private  Employee employee = EmployeeFactory.build("086", "scorpionn@gmail,com", name);
    Country country = new Country.Builder().build();
    private  City city = CityFactory.build("7854", "Cape Town", country);
    private EmployeeServiceImpl employeeService;

    @Test
    void save(){
        Employee saved = this.employeeService.save(this.employee);
        assertAll(()-> assertNotNull(saved), () -> assertEquals(this.employee, saved));
    }

    @Test
    void read() {
        Optional<Employee> read = this.employeeService.read(this.employee.getStaffId());
        System.out.println(read);
        assertAll(() -> assertTrue(read.isPresent()), () -> assertSame(this.employee, read.get()));
    }

    @Test
    void delete() {
        this.employeeService.delete(this.employee);
        List<Employee> employeeList = this.employeeService.findAll();
        assertSame(0, employeeList.size());
    }
    @Test
    void findAllStaffId() {
        String staffId = this.employee.getStaffId();
        List<Employee> employeeList = this.employeeService.findAll();
        assertSame(1 , employeeList.size());
    }

    @Test
    void findByCity_IdOrderByName(String cityId) {
        this.employeeService.findByCity_IdOrderByName(cityId);
        assertSame(this.employee.getStaffId(),cityId);
    }

}

