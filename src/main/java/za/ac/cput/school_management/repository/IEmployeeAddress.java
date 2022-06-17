/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Interface Repository :Employee Address repository
 */
package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.EmployeeAddress;


import java.util.List;


public interface IEmployeeAddress extends IRepository<EmployeeAddress,String>{
    public List<EmployeeAddress> findByStaffId(String StaffId);
}
