/*  CountryRepository.java
    Interface to store Country entities
    Author: Wilbur Deano Smith (220003033)
    Date: 18 June 2022
*/
package za.ac.cput.school_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String>
{
}
