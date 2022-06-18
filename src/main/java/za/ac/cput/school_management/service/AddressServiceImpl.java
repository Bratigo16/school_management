/*
 *Author:Yaaseen Safodien 218336950
 *Applications Development ADP3
 *Assignment School management
 *Service :Address Service Impl
 */
package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.Address;
import za.ac.cput.school_management.repository.AddressRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepository repository;
    private static AddressService SERVICE;

    public AddressServiceImpl() {
        this.repository = AddressRepository.getRepository();
    }

    public static AddressServiceImpl getService() {
        if (SERVICE == null)
            SERVICE = new AddressServiceImpl();
        return (AddressServiceImpl) SERVICE;

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
    public List<Address> findAll() {
        return this.repository.findAll();
    }
}
