package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.repository.CityRepository;

import java.util.List;
import java.util.Optional;

public class CityServiceImpl implements CityService{
    private CityRepository repository;
    private static CityServiceImpl Service;

    private CityServiceImpl(){

        this.repository= CityRepository.GetCityRepository();
    }
    public static CityServiceImpl GetCityService (){
        if(Service == null)
            Service= new CityServiceImpl();
        return Service;
    }
    @Override
    public City save(City city) {
        return this.repository.save(city);
    }

    @Override
    public Optional<City> read(String id) {
        return this.repository.read(id);
    }

    @Override
    public City reading(City city) {
        return null;
    }


    @Override
    public void delete(City city) {
 this.repository.delete(city);

    }
    public List<City> findAll(){
        return  this.repository.findAll();
    }
}
