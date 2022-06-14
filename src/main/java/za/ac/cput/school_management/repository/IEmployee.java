/*
 *Author:Chad Siegelaar 218340982
 *
 *13 June 2022
 */

package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.Employee;

import java.util.List;

public interface IEmployee extends IRepository<Employee, String> {
    List<Employee> findAll();
}
