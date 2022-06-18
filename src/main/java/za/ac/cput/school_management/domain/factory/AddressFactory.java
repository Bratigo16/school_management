package za.ac.cput.school_management.domain.factory;

import za.ac.cput.school_management.domain.Address;
import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.helper.StringHelper;

public class AddressFactory {
    public static Address build(String unitNumber, String complexName,String streetNumber, String streetName,Integer PostalCode, City city) {
        StringHelper.checkStringParam("unitNumber", unitNumber);
        StringHelper.checkStringParam("complexName", complexName);
        StringHelper.checkStringParam("StreetNumber", streetNumber);
        StringHelper.checkStringParam("PostalCode", String.valueOf(PostalCode));

        return new Address.Builder()
                .UnitNumber(unitNumber)
                .complexName(complexName)
                .StreetNumber(streetNumber)
                .StreetName(streetName)
                .PostalCode(PostalCode)
                .City(city)
                .build();
    }
}

