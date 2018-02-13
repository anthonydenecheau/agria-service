package com.scc.agria.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scc.agria.model.Dog;

@Repository
public interface DogRepository extends CrudRepository<Dog,String>  {
    public Dog findById(int id);
    public List<Dog> findByTatouage(String toutage);
    public List<Dog> findByTranspondeur(String transpondeur);
    
    public Dog save (Dog dog);
    
    @Transactional
    public void deleteById(int id);

}
