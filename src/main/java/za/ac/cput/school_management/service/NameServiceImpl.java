package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.Name;
import za.ac.cput.school_management.repository.NameRepository;

import java.util.List;
import java.util.Optional;

public class NameServiceImpl implements NameService{
    private final NameRepository repository;
    private static NameServiceImpl NAMEService;

    private NameServiceImpl(){
        this.repository = NameRepository.nameRepository();
    }

    public static NameServiceImpl getNAMEService(){
        if(NAMEService ==null)
            NAMEService = new NameServiceImpl();
        return  NAMEService;
    }
    @Override
    public Name save(Name name) {
        return this.repository.save(name);
    }

    @Override
    public Optional<Name> read(String s) {
        return Optional.empty();
    }


    @Override
    public Name reading(Name name) {
        return this.repository.reading(name);
    }

    @Override
    public void delete(Name name) {
      this.repository.delete(name);
    }
    public List<Name> findAll() {
        return this.repository.findAll();
    }
}
