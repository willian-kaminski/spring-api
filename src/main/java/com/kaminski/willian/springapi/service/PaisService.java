package com.kaminski.willian.springapi.service;

import com.kaminski.willian.springapi.models.Pais;
import com.kaminski.willian.springapi.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Willian Kaminski
 * @since 29-09-19
 * @version 1.0
 */

@Service
public class PaisService {
    
    @Autowired
    private PaisRepository paisRepository;

    public List<Pais> getAllPaises(){
        return paisRepository.findAll();   
    }
    
    public Pais getPais(long id){
        return paisRepository.findById(id);                
    }
    
    public Pais postPais(Pais pais){
        return paisRepository.save(pais);
    }
    
    public void deletePais(Pais pais){
        paisRepository.delete(pais);
    }
    
    public void deletePais(long id){
        paisRepository.deleteById(id);
    }
    
    public Pais putPais(Pais pais){
        return paisRepository.save(pais);
    }
}
