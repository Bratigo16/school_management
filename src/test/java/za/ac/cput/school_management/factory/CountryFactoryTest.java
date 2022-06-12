package za.ac.cput.school_management.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.Country;

import static org.junit.jupiter.api.Assertions.*;

class CountryFactoryTest
{
    @Test
    public void buildCountryWithSuccess()
    {
        Country country = CountryFactory
                .build("100", "South Africa");
        assertNotNull(country);
    }

    @Test
    public void buildCountryWithError()
    {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                CountryFactory
                        .build(null, "Namibia"));
        assertTrue(exception.getMessage().contains("id"));
    }

}