package com.bibliotecaNoSQL.IService;

import com.bibliotecaNoSQL.Document.Libro;
import java.util.List;
import java.util.Optional;

public interface ILibroService {
    List<Libro> findAll();
    Optional<Libro> findById(Long ID);
    Libro save(Libro libro);
    void update(Libro libro, Long id);
    void delete(Long id);
}
