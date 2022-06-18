/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Service : Employee Address Service
 */
package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.EmployeeAddress;


import java.util.List;

public interface EmployeeAddressService extends IService<EmployeeAddress,String>{
    List<EmployeeAddress> findAllStaffId (String staffId);


}