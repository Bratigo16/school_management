/*  CountryRepository.java
    Class with business logic for Country entity
    Author: Wilbur Deano Smith (220003033)
    Date: 16 June 2022
*/
package za.ac.cput.school_management.service;

import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.Country;
import za.ac.cput.school_management.repository.CountryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService implements ICountry
{
    private final CountryRepository countryRepository;

    private CountryService(CountryRepository countryRepository)
    {
        this.countryRepository = countryRepository;
    }

    @Override
    public Country save(Country country) {
        return this.countryRepository.save(country);
    }

    @Override
    public Optional read(String id) {
        return this.countryRepository.findById(id);
    }

    @Override
    public Country reading(Country country) {
        return null;
    }

    @Override
    public void delete(Country country) {
        this.countryRepository.delete(country);
    }

    @Override
    public List<Country> findAll() {
        return null;
    }
}
