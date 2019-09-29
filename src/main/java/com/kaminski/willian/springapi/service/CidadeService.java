package com.kaminski.willian.springapi.service;

import com.kaminski.willian.springapi.models.Cidade;
import com.kaminski.willian.springapi.repository.CidadeRepository;
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
public class CidadeService {
 
    @Autowired
    private CidadeRepository cidadeRepository;
    
    public List<Cidade> getAllCidades(){
        return cidadeRepository.findAll();
    }
    
    public Cidade getCidade(long id){
        return cidadeRepository.findById(id);
    }
    
    public Cidade postCidade(Cidade cidade){
        return cidadeRepository.save(cidade);
    }
    
    public void deleteCidade(Cidade cidade){
        cidadeRepository.delete(cidade);
    }
    
    public void deleteCidade(long id){
        cidadeRepository.deleteById(id);
    }
    
    public Cidade putCidade(Cidade cidade){
        return cidadeRepository.save(cidade);
    }
}
