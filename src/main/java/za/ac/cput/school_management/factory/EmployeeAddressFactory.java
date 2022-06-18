/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Repository :Employee Address repository
 */
package za.ac.cput.school_management.factory;

import org.apache.tomcat.jni.Address;
import za.ac.cput.school_management.domain.EmployeeAddress;
import za.ac.cput.school_management.helper.StringHelper;

public class EmployeeAddressFactory {
    public static EmployeeAddress build(String staffId, Address address){
        StringHelper.checkStringParam("staffId",staffId);


        return new EmployeeAddress.Builder().staffId(staffId)
                .Address(address).build();
    }
}

