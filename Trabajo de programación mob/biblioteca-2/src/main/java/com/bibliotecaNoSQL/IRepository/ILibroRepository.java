package com.bibliotecaNoSQL.IRepository;

import com.bibliotecaNoSQL.Document.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepository extends MongoRepository<Libro, Long> {
}
