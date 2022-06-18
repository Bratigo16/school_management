package za.ac.cput.school_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.Name;

import java.util.List;
import java.util.Optional;
@Repository
public interface INameRepository extends JpaRepository<Name,String> {
     List<Name>findAll ();
     Name reading (Name name );
    void delete(Name name);

      Optional<Name> read(String s);
}
