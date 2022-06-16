package za.ac.cput.school_management.repository;
import za.ac.cput.school_management.domain.City;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CityRepository implements ICityRepository{
    private List<City> CityList;
    private static CityRepository City_REPOSITORY;

    private CityRepository(){
        this.CityList = new ArrayList<>();
    }
    public static CityRepository GetCityRepository (){
        if(City_REPOSITORY == null)
            City_REPOSITORY= new CityRepository();
        return City_REPOSITORY;
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
}


