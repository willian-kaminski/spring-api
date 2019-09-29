package com.kaminski.willian.springapi.controller;

import com.kaminski.willian.springapi.models.Pais;
import com.kaminski.willian.springapi.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Willian Kaminski
 * @since 28-09-19
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/api")
public class PaisRecource {
    
    @Autowired
    PaisRepository paisRepository;
    
    @GetMapping(value = "/paises")
    public List<Pais> listPais(){
        return paisRepository.findAll();
    }
    
    @GetMapping(value = "/pais/{id}")
    public Pais listUnicPais(@PathVariable(value = "id") long id){
        return paisRepository.findById(id); 
    }
    
    @PostMapping(value = "/pais")
    public Pais savePais(@RequestBody Pais pais){
        return paisRepository.save(pais);
    }
    
    @DeleteMapping(value = "/pais")
    public void deletePais(@RequestBody Pais pais){
        paisRepository.delete(pais);
    }
    
    @DeleteMapping(value = "/pais/{id}")
    public void deletePais(@PathVariable(value = "id") long id){
        paisRepository.deleteById(id);
    }
    
    @PutMapping(value = "/pais")
    public Pais putPais(@RequestBody Pais pais){
        return paisRepository.save(pais);
    }
}
