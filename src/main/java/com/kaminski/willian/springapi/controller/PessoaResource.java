package com.kaminski.willian.springapi.controller;

import com.kaminski.willian.springapi.models.Pessoa;
import com.kaminski.willian.springapi.repository.PessoaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
public class PessoaResource {
    
    @Autowired
    PessoaRepository pessoaRepository;
    
    @GetMapping(value = "/pessoas")
    public List<Pessoa> listPessoas(){
        return pessoaRepository.findAll();
    }
    
    @GetMapping(value = "/pessoa/{id}")
    public Pessoa listUnicPessoas(@PathVariable(value = "id") int id){
        return pessoaRepository.findById(id); 
    }
    
    @PostMapping(value = "/pessoa")
    public Pessoa savePessoa(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }
}