package com.bibliotecaNoSQL.IRepository;

import com.bibliotecaNoSQL.Document.Autor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends MongoRepository<Autor, Long> {
}
