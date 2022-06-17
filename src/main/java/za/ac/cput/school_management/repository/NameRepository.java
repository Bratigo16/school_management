package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.Name;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public  class NameRepository implements INameRepository {
    private List<Name> NameList;
    private static NameRepository NAME_REPOSITORY;

    private NameRepository(){
        this.NameList = new ArrayList<>();
    }
public static NameRepository nameRepository(){
        if(NAME_REPOSITORY ==null)
            NAME_REPOSITORY = new NameRepository();
        return  NAME_REPOSITORY;
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
public void delete (Name name){
this.NameList.remove(name);

}

    public List<Name> findAll() {
        return this.NameList;
    }
}
