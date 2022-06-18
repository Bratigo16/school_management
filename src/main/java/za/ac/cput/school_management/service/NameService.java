package za.ac.cput.school_management.service;

import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.Name;

import java.util.List;
import java.util.Optional;
@Service
public interface NameService extends IService<Name,String> {
    List<Name> findAll ();

    Optional<Name> read(String s);

    Name reading(Name name);

     void delete(Name name);

}
