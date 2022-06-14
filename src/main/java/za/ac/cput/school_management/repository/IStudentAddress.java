package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.StudentAddress;

import java.util.List;


public interface IStudentAddress extends IRepository<StudentAddress,String>{
    public List<StudentAddress> findByStudentId(String studentId);
}
