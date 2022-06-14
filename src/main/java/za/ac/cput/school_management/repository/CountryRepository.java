/*  CountryRepository.java
    Class to store Country objects
    Author: Wilbur Deano Smith (220003033)
    Date: 14 June 2022
*/

package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CountryRepository implements ICountry
{
    private final List<Country> countryList;
    private static CountryRepository COUNTRY_REPOSITORY;

    private CountryRepository()
    {
        this.countryList = new ArrayList<>();
    }

    public static CountryRepository getCountryRepository()
    {
        if(COUNTRY_REPOSITORY == null)
            COUNTRY_REPOSITORY = new CountryRepository ();
        return COUNTRY_REPOSITORY;
    }

    @Override
    public Country save(Country country)
    {
        Optional<Country> read = read(country.getId());

        if (read.isPresent()){
            delete(read.get());

        }
        this.countryList.add(country);
        return country;
    }

    @Override
    public Optional<Country> read(String id)
    {
        return  this.countryList.stream()
                .filter(c -> c.getId().equalsIgnoreCase(id))
                .findFirst();
    }

    @Override
    public void delete(Country country)
    {
        this.countryList.remove(country);
    }

    @Override
    public List<Country> findAll()
    {
        return this.countryList;
    }
}
