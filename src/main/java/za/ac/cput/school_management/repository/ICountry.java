/*  ICountry.java
    Interface for the CountryRepository
    Author: Wilbur Deano Smith (220003033)
    Date: 14 June 2022
*/
package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.Country;

import java.util.List;

public interface ICountry extends IRepository<Country, String>
{
    List<Country> findAll();
}
