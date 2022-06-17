/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Repository :Employee Address repository
 */
package za.ac.cput.school_management.repository;
import za.ac.cput.school_management.domain.EmployeeAddress;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeAddressRepository {
    private final List<EmployeeAddress> EmployeeAddressList;
    private static EmployeeAddressRepository EMPLOYEE_ADDRESS_REPOSITORY;

    private EmployeeAddressRepository () {
        this.EmployeeAddressList = new ArrayList<>();
    }
    public static EmployeeAddressRepository getRepository (){
        if(EMPLOYEE_ADDRESS_REPOSITORY == null)
            EMPLOYEE_ADDRESS_REPOSITORY= new EmployeeAddressRepository ();
        return EMPLOYEE_ADDRESS_REPOSITORY;
    }

    public EmployeeAddress save (EmployeeAddress EmployeeAddress){
        Optional<EmployeeAddress> read = read(EmployeeAddress.getstaffId());
        if (read.isPresent()){
            delete(read.get());

        }
        this.EmployeeAddressList.add(EmployeeAddress);
        return EmployeeAddress;
    }

    public Optional< EmployeeAddress> read (String staffId) {

        return  this.EmployeeAddressList.stream().filter(g -> g.getstaffId().equalsIgnoreCase(staffId))
                .findFirst();

    }

    public void delete (EmployeeAddress EmployeeAddress){

        this.EmployeeAddressList.remove(EmployeeAddress);
    }
    public List<EmployeeAddress> findAll(){
        return  this. EmployeeAddressList;
    }
}
