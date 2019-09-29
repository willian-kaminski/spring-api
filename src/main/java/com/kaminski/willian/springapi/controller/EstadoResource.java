package com.kaminski.willian.springapi.controller;

import com.kaminski.willian.springapi.models.Estado;
import com.kaminski.willian.springapi.service.EstadoService;
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
 * @since 29-09-19
 * @version 1.0
 */

@RestController
@RequestMapping(value = "/api")
public class EstadoResource {
    
    @Autowired
    EstadoService estadoService;
    
    @GetMapping(value = "/estados")
    public List<Estado> listEstados(){
        return estadoService.getAllEstados();
    }
    
    @GetMapping(value = "/estado/{id}")
    public Estado listUnicEstado(@PathVariable(value = "id") long id){
        return estadoService.getEstado(id); 
    }
    
    @PostMapping(value = "/estado")
    public Estado saveEstado(@RequestBody Estado estado){ 
        return estadoService.postEstado(estado);
    }
    
    @DeleteMapping(value = "/estado")
    public void deleteEstado(@RequestBody Estado estado){
        estadoService.deleteEstado(estado);
    }
    
    @DeleteMapping(value = "/estado/{id}")
    public void deleteEstado(@PathVariable(value = "id") long id){
        estadoService.deleteEstado(id);
    }
    
    @PutMapping(value = "/estado")
    public Estado putPais(@RequestBody Estado estado){
        return estadoService.putEstado(estado);
    }
}