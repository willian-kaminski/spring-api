package com.kaminski.willian.springapi.controller;

import com.kaminski.willian.springapi.models.Pais;
import com.kaminski.willian.springapi.service.PaisService;
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
 * @since 28-09-19
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/api")
public class PaisResource {
    
    @Autowired
    PaisService paisService;
    
    @GetMapping(value = "/paises")
    @ApiOperation(value = "Retorna uma lista de Paises")
    public List<Pais> listPais(){
        return paisService.getAllPaises();
    }
    
    @GetMapping(value = "/pais/{id}")
    @ApiOperation(value = "Retorna um pais unico")
    public Pais listUnicPais(@PathVariable(value = "id") long id){
        return paisService.getPais(id); 
    }
    
    @PostMapping(value = "/pais")
    @ApiOperation(value = "Salva uma Pais")
    public Pais savePais(@RequestBody Pais pais){ 
        return paisService.postPais(pais);
    }
    
    @DeleteMapping(value = "/pais")
    @ApiOperation(value = "Deleta um Pais")
    public void deletePais(@RequestBody Pais pais){
        paisService.deletePais(pais);
    }
    
    @DeleteMapping(value = "/pais/{id}")
    @ApiOperation(value = "Deleta um pais com base no seu Id")
    public void deletePais(@PathVariable(value = "id") long id){
        paisService.deletePais(id);
    }
    
    @PutMapping(value = "/pais")
    @ApiOperation(value = "Atualiza os dados do Pais")
    public Pais putPais(@RequestBody Pais pais){
        return paisService.putPais(pais);
    }
}
