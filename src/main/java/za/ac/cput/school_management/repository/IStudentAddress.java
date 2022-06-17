/*
 *Author:Tasneem Jacobs 215030389
 *Applications Development ADP3
 *Assignment School management
 *Interface Repository :Student Address repository
 */
package za.ac.cput.school_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.StudentAddress;

import java.util.List;
@Repository

public interface IStudentAddress extends JpaRepository<StudentAddress,String> {
  List<StudentAddress> findAllStudentId(String studentId);
}
