/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Service :Address Service
 */
package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.Address;



import java.util.List;


public interface AddressService extends IService<Address,String>{

        List<za.ac.cput.school_management.service.AddressService> findAllUnitNumber (String UnitNumber);
}