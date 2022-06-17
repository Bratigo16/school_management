/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Repository :Address repository
 */
package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.Address;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AddressRepository {
    private final List<Address> AddressList;
    private static AddressRepository ADDRESS_REPOSITORY;

    private AddressRepository () {
        this.AddressList = new ArrayList<>();
    }
    public static AddressRepository getRepository (){
        if(ADDRESS_REPOSITORY == null)
            ADDRESS_REPOSITORY= new AddressRepository ();

        return ADDRESS_REPOSITORY;
    }

    public Address save (Address Address){
        Optional<Address> read = read(Address.getUnitNumber());
        if (read.isPresent()){
            delete(read.get());

        }
        this.AddressList.add(Address);
        return Address;
    }

    public Optional< Address> read (String UnitNumber) {
        return  this.AddressList.stream().filter(g -> g.getUnitNumber().equalsIgnoreCase(UnitNumber))
                .findFirst();

    }

    public void delete (Address Address){
        this.AddressList.remove(Address);
    }

    public List<Address> findAll(){
        return  this. AddressList;
    }
}
