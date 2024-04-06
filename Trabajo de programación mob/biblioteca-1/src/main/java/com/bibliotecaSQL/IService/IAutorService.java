package com.bibliotecaSQL.IService;

import com.bibliotecaSQL.Entity.Autor;
import java.util.List;
import java.util.Optional;

public interface IAutorService {
    List<Autor> findAll();
    Optional<Autor> findById(Long ID);
    Autor save(Autor autor);
    void update(Autor autor, Long id);
    void delete(Long id);
}
