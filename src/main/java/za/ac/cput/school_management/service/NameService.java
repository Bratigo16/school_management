package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.Name;

import java.util.List;

public interface NameService extends IService<Name,String> {
    public List<Name> findAll ();

}
