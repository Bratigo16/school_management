package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.Country;

import java.util.List;

public interface ICountry extends IService<Country, String>
{
    List<Country> findAll();
}
