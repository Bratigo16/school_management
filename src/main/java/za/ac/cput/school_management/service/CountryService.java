/*  CountryRepository.java
    Class with business logic for Country entity
    Author: Wilbur Deano Smith (220003033)
    Date: 16 June 2022
*/
package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.Country;
import za.ac.cput.school_management.repository.CountryRepository;

import java.util.Optional;

public class CountryService implements ICountry
{
    private final CountryRepository countryRepository;
    private static CountryService COUNTRY_SERVICE;

    private CountryService()
    {
        this.countryRepository = CountryRepository.getCountryRepository();
    }

    public static CountryService getCountryRepository()
    {
        if(COUNTRY_SERVICE == null)
            COUNTRY_SERVICE = new CountryService ();
        return COUNTRY_SERVICE;
    }

    @Override
    public Country save(Country country) {
        return this.countryRepository.save(country);
    }

    @Override
    public Optional read(String id) {
        return this.countryRepository.read(id);
    }

    @Override
    public Country reading(Country o) {
        return this.countryRepository.reading(o);
    }

    @Override
    public void delete(Country country) {
        this.countryRepository.delete(country);
    }
}
