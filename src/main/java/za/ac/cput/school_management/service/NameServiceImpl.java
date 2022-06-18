package za.ac.cput.school_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.Name;
import za.ac.cput.school_management.repository.NameRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@Service
public class NameServiceImpl implements NameService{
   @Autowired private final NameRepository repository;
    private NameServiceImpl(NameRepository repository){
        this.repository =repository;
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
