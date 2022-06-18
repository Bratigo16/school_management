package za.ac.cput.school_management.service;


/*
 *  Author:BS Brady Sheldon 219053715
 *  Student
 *  June Assignment
 *
 * */

import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.Student;

import za.ac.cput.school_management.repository.StudentRepository;

import java.util.List;
import java.util.Optional;


@Service
public class StudentServiceImp implements IStudentService {

    private final StudentRepository repository;
    private static IStudentService SERVICE ;


    public StudentServiceImp() {
        this.repository = StudentRepository.getRepository();
    }

    public static StudentServiceImp getService() {
        if(SERVICE == null)
            SERVICE = new StudentServiceImp();
        return (StudentServiceImp) SERVICE;
    }


    @Override
    public Student save(Student student) {
        return this.repository.save(student);
    }

    @Override
    public Optional<Student> read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Student reading(Student student) {
        return null;
    }

    @Override
    public void delete(Student student) {
        this.repository.delete(student);

    }


    @Override
    public List<Student> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Student findByStudent_IDOrderByLastName(String countryId) {
        return null;
    }


}