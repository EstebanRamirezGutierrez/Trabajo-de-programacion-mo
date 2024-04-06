package com.bibliotecaNoSQL.Service;

import com.bibliotecaNoSQL.Document.Libro;
import com.bibliotecaNoSQL.IRepository.ILibroRepository;
import com.bibliotecaNoSQL.IService.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService implements ILibroService {
    @Autowired
    private ILibroRepository repository;

    @Override
    public List<Libro> findAll(){
        return repository.findAll();
    }

    @Override
    public Optional<Libro> findById(Long id){
        return repository.findById(id);
    }

    @Override
    public Libro save(Libro libro){
        return repository.save(libro);
    }

    @Override
    public void update(Libro libro, Long id){
        Optional<Libro> libroOld = repository.findById(id);
        if(!libroOld.isEmpty()){
            Libro libroUpdate = libroOld.get();
            libroUpdate.setTitulo(libro.getTitulo());
            libroUpdate.setISBN(libro.getISBN());
            libroUpdate.setGenero(libro.getGenero());
            libroUpdate.setAnioPublicacion(libro.getAnioPublicacion());
            libroUpdate.setSinopsis(libro.getSinopsis());
            libroUpdate.setAutor(libro.getAutor());
            repository.save(libroUpdate);
        } else {
            System.out.println("No existe el libro con id " + id);
        }
    }

    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
}
