package za.ac.cput.school_management.factory;

import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.domain.Country;

public class CityFactory {
    public static City build(  String id, String name, Country country){
        if( id ==null|| id.isEmpty() )
            throw new  IllegalArgumentException("Id is required");
        if( name ==null || name.isEmpty() )
            throw new  IllegalArgumentException("Name is required");
        if(country.getId()==null ||country.getName().isEmpty())
            throw new  IllegalArgumentException("Country is required");

return  new City.Builder().setId(id).setName(name).setCountry(country).build();
    }
}
