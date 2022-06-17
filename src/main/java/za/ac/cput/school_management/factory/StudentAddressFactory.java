/*
 *Author:Tasneem Jacobs 215030389
 *Applications Development ADP3
 *Assignment School management
 *Factory :Student Address Factory
 */
package za.ac.cput.school_management.factory;
import org.apache.tomcat.jni.Address;
import za.ac.cput.school_management.domain.StudentAddress;
import za.ac.cput.school_management.helper.StringHelper;

public class StudentAddressFactory {
    public static StudentAddress build(String studentId, Address address){
        StringHelper.checkStringParam("studentId",studentId);




        return new StudentAddress.Builder().studentId(studentId)
                .address(address).build();
    }
}


