/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Interface Repository :Address repository
 */
package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.Address;
import za.ac.cput.school_management.domain.StudentAddress;

import java.util.List;

    public interface IAddress extends IRepository<Address,String>{
        public List<StudentAddress> findByUnitNumber(String unitNumber);
    }

