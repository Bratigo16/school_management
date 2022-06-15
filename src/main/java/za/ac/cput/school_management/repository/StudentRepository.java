package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.Student;


import java.util.*;

/*
 *  Author: Brady Sheldon 219053715
 *  Student
 *  June Assignment
 *  Date: 09 June 2022
 * */
public class StudentRepository {

    private static StudentRepository repository;

    private final List<Student> StudentDB;

    private StudentRepository() {
        this.StudentDB = new ArrayList<>();
    }

    public static StudentRepository getRepository() {
        if (repository == null) {
            repository = new StudentRepository();
        }
        return repository;
    }

    public Student save(Student student) {
        Optional<Student> read = read(student.getStudentID());
        if (read.isPresent()){
            delete(read.get());
        }
        this.StudentDB.add(student);
        return student;
    }

    public Optional<Student> read(String StudentID) {
        return this.StudentDB.stream().filter(g -> g.getStudentID().equalsIgnoreCase(StudentID))

                .findFirst();
    }
    public void delete(Student student) {
        this.StudentDB.remove(student);

    }
    public List<Student> findAll() {
        return this.StudentDB;
    }
}