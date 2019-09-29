package com.kaminski.willian.springapi.service;

import com.kaminski.willian.springapi.models.Pessoa;
import com.kaminski.willian.springapi.repository.PessoaRepository;
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
public class PessoaService {
    
    @Autowired
    PessoaRepository pessoaRepository;
    
    public List<Pessoa> getAllPessoas(){
        return pessoaRepository.findAll();
    }
    
    public Pessoa getPessoa(long id){
        return pessoaRepository.findById(id);
    }
    
    public Pessoa postPessoa(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }
    
    public void deletePeople(Pessoa pessoa){
        pessoaRepository.delete(pessoa);
    }
    
    public void deletePeople(long id){
        pessoaRepository.deleteById(id);
    }
    
    public Pessoa putPessoa(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }
}
