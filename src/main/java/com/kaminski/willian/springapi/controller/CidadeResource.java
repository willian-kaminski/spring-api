package com.kaminski.willian.springapi.controller;

import com.kaminski.willian.springapi.models.Cidade;
import com.kaminski.willian.springapi.service.CidadeService;
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
public class CidadeResource {
   
   @Autowired
    CidadeService cidadeService; 
   
   @GetMapping(value = "/cidades")
   @ApiOperation(value = "Retorna uma lista de Cidades")
   public List<Cidade> listCidades(){
       return cidadeService.getAllCidades();
   }
   
   @GetMapping(value = "/cidade/{id}")
   @ApiOperation(value = "Retorna uma cidade unica")
    public Cidade listUnicCidade(@PathVariable(value = "id") long id){
        return cidadeService.getCidade(id); 
    }
    
    @PostMapping(value = "/cidade")
    @ApiOperation(value = "Salva um Cidade")
    public Cidade saveCidade(@RequestBody Cidade cidade){ 
        return cidadeService.postCidade(cidade);
    }
    
    @DeleteMapping(value = "/cidade")
    @ApiOperation(value = "Deleta uma Cidade")
    public void deleteCidade(@RequestBody Cidade cidade){
        cidadeService.deleteCidade(cidade);
    }
    
    @DeleteMapping(value = "/cidade/{id}")
    @ApiOperation(value = "Deleta uma cidade com base no seu Id")
    public void deleteCidade(@PathVariable(value = "id") long id){
        cidadeService.deleteCidade(id);
    }
    
    @PutMapping(value = "/cidade")
    @ApiOperation(value = "Atualiza os dados da Cidade")
    public Cidade putCidade(@RequestBody Cidade cidade){
        return cidadeService.putCidade(cidade);
    }
}
