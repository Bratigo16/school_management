package za.ac.cput.school_management.repository;

import java.util.Optional;

public interface IRepository <T,ID>{
    T save(T t);
    Optional<T> read (ID id);
    T reading(T t );
    void  delete(T t);
}
