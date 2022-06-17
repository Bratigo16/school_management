/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Service :Address Service Impl
 */
package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.Address;
import za.ac.cput.school_management.repository.AddressRepository;

import java.util.List;
import java.util.Optional;

public class AddressServiceImpl implements AddressService {
    private final AddressRepository repository;
    private static AddressService SERVICE;

    private AddressServiceImpl () {
        this.repository = AddressRepository.getRepository();
    }

    public static AddressService getService() {
        if (SERVICE == null)
            SERVICE = (AddressService) new AddressServiceImpl();
        return SERVICE;

    }
    @Override
    public Address save(Address address) {
        return this.repository.save(address);
    }

    @Override
    public Optional<Address> read(String unitNumber) {
        return this.repository.read(unitNumber);
    }

    @Override
    public Address reading(Address address) {
        return null;
    }


    @Override
    public void delete(Address address) {
        this.repository.delete(address);

    }

    @Override
    public List<AddressService> findAllUnitNumber(String UnitNumber) {

        return null;
    }
}
