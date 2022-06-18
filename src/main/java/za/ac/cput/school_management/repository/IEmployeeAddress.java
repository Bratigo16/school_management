/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Interface Repository :Employee Address
 */
package za.ac.cput.school_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.school_management.domain.EmployeeAddress;


import java.util.List;


public interface IEmployeeAddress extends JpaRepository<EmployeeAddress,String> {
    List<EmployeeAddress> findAll();
}
