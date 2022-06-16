package za.ac.cput.school_management.repository;
/*
 *  Author: Brady Sheldon 219053715
 *  Student
 *  June Assignment
 *  Date: 09 June 2022
 * */

import za.ac.cput.school_management.domain.Student;

import java.util.List;

public interface IStudentRepository extends IRepository<Student, String> {


    List<Student> findAll();
}