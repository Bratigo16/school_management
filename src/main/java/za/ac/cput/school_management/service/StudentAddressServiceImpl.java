/*
 *Author:Tasneem Jacobs 215030389
 *Applications Development ADP3
 *Assignment School management
 *Service :Student Address service Impl
 */
package za.ac.cput.school_management.service;


import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.StudentAddress;
import za.ac.cput.school_management.repository.StudentAddressRepository;

import java.util.List;
import java.util.Optional;
@Service
public class StudentAddressServiceImpl implements  StudentAddressService {
    private final StudentAddressRepository repository;


    public StudentAddressServiceImpl (StudentAddressRepository repository) {
        this.repository = repository;
    }
    @Override
    public StudentAddress save(StudentAddress studentAddress) {
        return this.repository.save(studentAddress);
    }

    @Override
    public Optional<StudentAddress> read(String studentId) {
        return this.repository.read(studentId);
    }



    @Override
    public void delete(StudentAddress studentAddress) {
        this.repository.delete(studentAddress);

    }

    @Override
    public List<StudentAddress> findAllStudentId(String studentId) {
        return this.repository.findAll();
    }
}


