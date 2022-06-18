/*  ICountry.java
    Interface for CountryService
    Author: Wilbur Deano Smith (220003033)
    Date: 18 June 2022
*/
package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.Country;

import java.util.List;

public interface ICountry extends IService<Country, String>
{
    List<Country> findAll();
}
