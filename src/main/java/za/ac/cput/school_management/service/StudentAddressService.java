/*
 *Author:Tasneem Jacobs 215030389
 *Applications Development ADP3
 *Assignment School management
 *Interface Service :Student Address Interface
 */package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.StudentAddress;

import java.util.List;

public interface StudentAddressService extends IService<StudentAddress,String>{
    List<StudentAddressService> findAllStudentId (String studentId);


}
