package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.City;

import java.util.List;
import java.util.Optional;

public interface CityService extends IService<City,String> {
    public List<City> findAll ();
}
