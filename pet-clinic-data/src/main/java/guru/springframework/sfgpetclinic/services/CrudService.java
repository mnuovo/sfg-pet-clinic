package guru.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, I> {
    Set<T> findAll();
    T save(T object);
    void delete(T object);
    void deleteById(I id);
}
