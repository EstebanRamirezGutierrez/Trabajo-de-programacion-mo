package com.bibliotecaSQL.IRepository;

import com.bibliotecaSQL.Entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepository extends JpaRepository<Libro, Long> {
}
