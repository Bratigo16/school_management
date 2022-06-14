package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.domain.Name;

import java.util.List;

public interface ICityRepository  extends IRepository<City,String> {
    public List<City> findAll ();
}
