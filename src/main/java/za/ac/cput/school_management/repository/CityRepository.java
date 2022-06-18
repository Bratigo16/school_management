package za.ac.cput.school_management.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.City;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public abstract class CityRepository implements ICityRepository{
    private final List<City> CityList;
  @Autowired private CityRepository(){
        this.CityList = new ArrayList<>();
    }


    public City save (City city){
        Optional<City> read = read(city.getId());
        if (read.isPresent()){
            delete(read.get());

        }
        this.CityList.add(city);
        return city;
    }
    public Optional< City> read (String Id) {

        return this.CityList.stream().filter(city -> city.getId().equalsIgnoreCase(Id))
                .findFirst();
    }

    @Override
    public City reading(City city) {
        return null;
    }

    public void delete (City city){

        this.CityList.remove(city);
    }
    public List<City> findAll(){
        return  this.CityList;
    }

    @Override
    public City findByCountry_IdOrderByName(String countryId) {
        return (City) this.CityList;
    }
}


