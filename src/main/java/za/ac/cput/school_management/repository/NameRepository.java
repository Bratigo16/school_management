package za.ac.cput.school_management.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.Name;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository

public abstract class NameRepository implements INameRepository {
    private List<Name> NameList;

    private NameRepository(){
        this.NameList = new ArrayList<>();
    }

public Name save (Name name){
        this.NameList.add(name);
        return name;
}

    @Override
    public Optional<Name> read(String s) {
        return Optional.empty();
    }

    public Name reading (Name name ){
        for (Name n : NameList) {
            if (name.getFirstName() == n.getFirstName()
                    && name.getMiddleName() == n.getMiddleName()
                    && name.getLastName() == n.getFirstName())
                return n;
        }
        return  null;
}
@Override
public void delete (Name name){
this.NameList.remove(name);

}

    public List<Name> findAll() {
        return this.NameList;
    }
}
