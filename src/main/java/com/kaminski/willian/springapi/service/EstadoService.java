package com.kaminski.willian.springapi.service;

import com.kaminski.willian.springapi.models.Estado;
import com.kaminski.willian.springapi.repository.EstadoRepository;
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
public class EstadoService {
    
    @Autowired
    EstadoRepository estadoRepository;
    
    public List<Estado> getAllEstados(){
        return estadoRepository.findAll();
    }
    
    public Estado getEstado(long id){
        return estadoRepository.findById(id);
    }
    
    public Estado postEstado(Estado estado){
        return estadoRepository.save(estado);
    }
    
    public void deleteEstado(Estado estado){
        estadoRepository.delete(estado);
    }
    
    public void deleteEstado(long id){
        estadoRepository.deleteById(id);
    }
    
    public Estado putEstado(Estado estado){
        return estadoRepository.save(estado);
    }
}
