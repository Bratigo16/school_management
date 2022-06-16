package za.ac.cput.school_management.service;


import java.util.Optional;

public interface IService <T,ID>
{
    T save(T t);
    Optional<T> read (ID id);
    T reading(T t );
    void  delete(T t);
}
