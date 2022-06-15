/*
 *Author:Tasneem Jacobs 215030389
 *Applications Development ADP3
 *Assignment School management
 *Repository :Student Address repository
 */
package za.ac.cput.school_management.repository;
import za.ac.cput.school_management.domain.StudentAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class StudentAddressRepository {
    private final List<StudentAddress> studentAddressList;
    private static StudentAddressRepository STUDENT_ADDRESS_REPOSITORY;

    private StudentAddressRepository () {
        this.studentAddressList = new ArrayList<>();
    }
    public static StudentAddressRepository getRepository (){
        if(STUDENT_ADDRESS_REPOSITORY == null)
            STUDENT_ADDRESS_REPOSITORY= new StudentAddressRepository ();
        return STUDENT_ADDRESS_REPOSITORY;
    }

    public StudentAddress save (StudentAddress StudentAddress){
        Optional<StudentAddress> read = read(StudentAddress.getStudentId());
        if (read.isPresent()){
            delete(read.get());

        }
        this.studentAddressList.add(StudentAddress);
        return StudentAddress;
    }

    public Optional< StudentAddress> read (String studentId) {

        return  this.studentAddressList.stream().filter(g -> g.getStudentId().equalsIgnoreCase(studentId))
                .findFirst();

    }

    public void delete (StudentAddress studentAddress){

        this.studentAddressList.remove(studentAddress);
    }
    public List<StudentAddress> findAll(){
        return  this. studentAddressList;
    }
}


