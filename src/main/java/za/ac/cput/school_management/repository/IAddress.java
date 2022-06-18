/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Interface Repository :Address repository
 */
package za.ac.cput.school_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.school_management.domain.Address;



import java.util.List;

    public interface IAddress extends JpaRepository<Address,String>{
        List<Address> findAll();
    }

