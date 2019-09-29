package com.kaminski.willian.springapi.controller;

import com.kaminski.willian.springapi.models.Pessoa;
import com.kaminski.willian.springapi.repository.PessoaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@Api(value = "API REST Pessoas")
@CrossOrigin(origins = "*")
public class PessoaResource {
    
    @Autowired
    PessoaRepository pessoaRepository;
    
    @GetMapping(value = "/pessoas")
    @ApiOperation(value = "Retorna uma lista de Pessoas")
    public List<Pessoa> listPessoas(){
        return pessoaRepository.findAll();
    }
    
    @GetMapping(value = "/pessoa/{id}")
    @ApiOperation(value = "Retorna uma pessoa unica")
    public Pessoa listUnicPessoas(@PathVariable(value = "id") long id){
        return pessoaRepository.findById(id); 
    }
    
    @PostMapping(value = "/pessoa")
    @ApiOperation(value = "Salva uma Pessoa")
    public Pessoa savePessoa(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }
    
    @DeleteMapping(value = "/pessoa")
    @ApiOperation(value = "Deleta uma Pessoa")
    public void deletePessoa(@RequestBody Pessoa pessoa){
        pessoaRepository.delete(pessoa);
    }
    
    @DeleteMapping(value = "/pessoa/{id}")
    @ApiOperation(value = "Deleta uma pessoa com base no seu Id")
    public void deletePessoa(@PathVariable(value = "id") long id){
        pessoaRepository.deleteById(id);
    }
    
    @PutMapping(value = "/pessoa")
    @ApiOperation(value = "Atualiza os dados da Pessoa")
    public Pessoa putPessoa(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }
}