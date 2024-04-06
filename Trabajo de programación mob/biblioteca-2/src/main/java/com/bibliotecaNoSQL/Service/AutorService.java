package com.bibliotecaNoSQL.Service;

import com.bibliotecaNoSQL.Document.Autor;
import com.bibliotecaNoSQL.IRepository.IAutorRepository;
import com.bibliotecaNoSQL.IService.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService implements IAutorService {
    @Autowired
    private IAutorRepository repository;

    @Override
    public List<Autor> findAll(){
        return repository.findAll();
    }

    @Override
    public Optional<Autor> findById(Long id){
        return repository.findById(id);
    }

    @Override
    public Autor save(Autor autor){
        return repository.save(autor);
    }

    @Override
    public void update(Autor autor, Long id){
        Optional<Autor> autorOld = repository.findById(id);
        if(!autorOld.isEmpty()){
            Autor autorUpdate = autorOld.get();
            autorUpdate.setNombre(autor.getNombre());
            autorUpdate.setApellido(autor.getApellido());
            autorUpdate.setNacionalidad(autor.getNacionalidad());
            autorUpdate.setFechaNacimiento(autor.getFechaNacimiento());
            autorUpdate.setBiografia(autor.getBiografia());
            repository.save(autorUpdate);
        } else {
            System.out.println("No existe el autor con id " + id);
        }
    }

    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
}
