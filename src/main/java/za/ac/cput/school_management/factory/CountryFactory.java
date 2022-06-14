/*  CountryFactory.java
    Class to build Country objects
    Author: Wilbur Deano Smith (220003033)
    Date: 14 June 2022
*/

package za.ac.cput.school_management.factory;

import za.ac.cput.school_management.domain.Country;
import za.ac.cput.school_management.helper.StringHelper;

public class CountryFactory
{
    public static Country build(String id, String name)
    {
        StringHelper.checkStringParam("id", id);
        StringHelper.checkStringParam("name", name);

        return new Country.Builder()
                .setId(id)
                .setName(name)
                .build();
    }
}
