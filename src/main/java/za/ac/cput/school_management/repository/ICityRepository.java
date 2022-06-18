package za.ac.cput.school_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.City;


import java.util.List;
@Repository
public interface ICityRepository  extends IRepository<City,String> {
     List<City> findAll ();
      void delete (City city);
     City reading(City city);
     City findByCountry_IdOrderByName(String countryId);
}
