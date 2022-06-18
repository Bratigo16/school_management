package za.ac.cput.school_management.repository;

/*
 *  Author: Brady Sheldon 219053715
 *  Student
 *  June Assignment
 *
 * */


import za.ac.cput.school_management.domain.Student;
import java.util.*;


public class StudentRepository {


    private final List<Student> studentList;
    private static StudentRepository STUDENT_REPOSITORY;


    private StudentRepository() {
        this.studentList = new ArrayList<>();
    }

    public static StudentRepository getRepository() {
        if (STUDENT_REPOSITORY == null) {
            STUDENT_REPOSITORY = new StudentRepository();
        }
        return STUDENT_REPOSITORY;
    }

    public Student save(Student student) {
        Optional<Student> read = read(student.getStudentID());
        if (read.isPresent()){
            delete(read.get());
        }
        this.studentList.add(student);
        return student;
    }

    public Optional<Student> read(String StudentID) {
        return this.studentList.stream().filter(g -> g.getStudentID().equalsIgnoreCase(StudentID))

                .findFirst();
    }
    public void delete(Student student) {
        this.studentList.remove(student);

    }
    public List<Student> findAll() {
        return this.studentList;
    }


}