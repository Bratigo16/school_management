/*
 *Author:Tasneem Jacobs 215030389
 *Applications Development ADP3
 *Assignment School management
 *Service :Student Address service Impl
 */package za.ac.cput.school_management.service;


import za.ac.cput.school_management.domain.StudentAddress;
import za.ac.cput.school_management.repository.StudentAddressRepository;

import java.util.List;
import java.util.Optional;

public class StudentAddressServiceImpl implements  StudentAddressService {
    private final StudentAddressRepository repository;
    private static StudentAddressService SERVICE;

    private StudentAddressServiceImpl () {
        this.repository = StudentAddressRepository.getRepository();
    }

    public static StudentAddressService getService() {
        if (SERVICE == null)
            SERVICE = (StudentAddressService) new StudentAddressServiceImpl();
        return SERVICE;

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
    public List<StudentAddressService> findAllStudentId(String studentId) {
        return null;
    }
}


