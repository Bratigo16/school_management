/*
 *Author:Chad Siegelaar 218340982
 *Employee Controller
 *16 June 2022
 */

package za.ac.cput.school_management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.domain.Employee;
import za.ac.cput.school_management.service.EmployeeServiceImpl;

import java.util.List;

@RestController
@RequestMapping ("school/employee/")
public class EmployeeController {
    private EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService){
        this.employeeService = employeeService;
    }
@PostMapping("save")
    public ResponseEntity<Employee> save (Employee employee){
        Employee save = employeeService.save((employee));
        return ResponseEntity.ok(save);
    }
@GetMapping("read/{staffId}")
    public ResponseEntity<Employee> read (@PathVariable String staffId) {
        Employee employee = this.employeeService.read(staffId).orElseThrow(
                ()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(employee);
    }
@GetMapping("readbyCityId")
    public ResponseEntity<Employee> findByCity_IdOrderByName(@PathVariable String cityId) {
        Employee employee = this.employeeService.findByCity_IdOrderByName(cityId);
        return ResponseEntity.ok(employee);
    }
@DeleteMapping("Delete")
    public ResponseEntity<Void> delete(Employee employee){
        this.employeeService.delete(employee);
        return ResponseEntity.noContent().build();
    }
@GetMapping("all")
    public ResponseEntity <List<Employee>> findAll() {
    List<Employee> employeeList = this.employeeService.findAll();
    return ResponseEntity.ok(employeeList);
}
}
