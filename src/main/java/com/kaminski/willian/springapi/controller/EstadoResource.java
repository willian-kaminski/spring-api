package com.kaminski.willian.springapi.controller;

import com.kaminski.willian.springapi.models.Estado;
import com.kaminski.willian.springapi.service.EstadoService;
import io.swagger.annotations.ApiOperation;
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
    @ApiOperation(value = "Retorna uma lista de Estados")
    public List<Estado> listEstados(){
        return estadoService.getAllEstados();
    }
    
    @GetMapping(value = "/estado/{id}")
    @ApiOperation(value = "Retorna um estado unico")
    public Estado listUnicEstado(@PathVariable(value = "id") long id){
        return estadoService.getEstado(id); 
    }
    
    @PostMapping(value = "/estado")
    @ApiOperation(value = "Salva um Estado")
    public Estado saveEstado(@RequestBody Estado estado){ 
        return estadoService.postEstado(estado);
    }
    
    @DeleteMapping(value = "/estado")
    @ApiOperation(value = "Deleta um Estado")
    public void deleteEstado(@RequestBody Estado estado){
        estadoService.deleteEstado(estado);
    }
    
    @DeleteMapping(value = "/estado/{id}")
    @ApiOperation(value = "Deleta um estado com base no seu Id")
    public void deleteEstado(@PathVariable(value = "id") long id){
        estadoService.deleteEstado(id);
    }
    
    @PutMapping(value = "/estado")
    @ApiOperation(value = "Atualiza os dados do Pais")
    public Estado putPais(@RequestBody Estado estado){
        return estadoService.putEstado(estado);
    }
}